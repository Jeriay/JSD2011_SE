package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 聊天室服务端
 */
public class Server {
    /*
    java.net.ServerSocket是运行在服务端的，如果我们把Socket
    比喻为电话，那么ServerSocket则比喻为 总机

    ServerSocket主要有两个工作：
    1.相服务端的操作系统申请服务端口，客服端就是通过这个端口与ServerSocket建立链接的
    2.监听服务端口，一旦一个客户端尝试建立链接，此时会立即创建一个
    Socket（相当于接电话），然后通过这个Socket就可以与建立链接
    的客户端交互了
     */
    private ServerSocket server;
    /**
     * 该数组用于保护所有ClientHandler对应的客户端的输出流
     * 便于他们之间互相广播消息使用
     */
//    private  PrintWriter[] allout={};
    private Collection<PrintWriter> allOut = new ArrayList<>();

    public Server(){
        try {
            System.out.println("正在启动服务端...");
            /*
                实例化ServerSocket可能抛出异常:
                java.net.BindException:address already in use
                如果遇到这个错误,说明申请的端口已经被其他程序使用了.
             */
            server = new ServerSocket(8088);
            System.out.println("服务端启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){

        try {
             /*
                ServerSocket提供的方法:
                Socket accept()
                该方法是一个阻塞方法,调用后开始等待客户端的连接,一旦一个客户端建立连接
                此时该方法会立即返回一个Socket,通过这个Socket实例与客户端交互.
                多次调用该方法可以接收多个客户端的连接.
             */
            while(true) {
                System.out.println("等待客户端连接...");
                Socket socket = server.accept();
                System.out.println("一个客户端连接了!");
                //当一个客户端连接后,启动一个线程来与其进行交互
                ClientHandler clientHandler = new ClientHandler(socket);
                Thread t = new Thread(clientHandler);
                t.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
    /**
     * 该线程任务是负责与指定的客户端进行交互
     */
    private class ClientHandler implements Runnable{
        private Socket socket;
        private String host;//当前客户端的IP地址信息

        public ClientHandler(Socket socket){
            this.socket = socket;
            //通过socket获取远端计算机的地址信息
            host = socket.getInetAddress().getHostAddress();
        }

        public void run(){
            PrintWriter pw=null;
            try {
                /*
                    Socket提供的方法:
                    InputStream getInputStream()
                    通过Socket获取的字节输入流可以读取远端计算机发送过来的字节
                */
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, "UTF-8");
                BufferedReader br = new BufferedReader(isr);
                //通过socket获取输出流，用于给客户端发送消息
                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw, true);
                    /*
                this不行，因为这里的this是ClientHandler实例每个线程都有自己的
                ClientHandler，因此看到的不是同一个对象
                 */
//                synchronized (this){ //不行
                /*
                allOut数组不可以，是因为我们对数组扩容过，扩容后会产生新对象这样其他线程
                看到的allOut不一定是当前线程之前锁定的数组对象了，很有可能看到的是扩容后的
                新数组对象（没有锁的）+
                 */
//                synchronized (allOut){  //不行

                //外部类的ServerSocket属性值没有改变过，可以作为锁对象
//                synchronized (serverSocket){//可以

                //或者直接用这些内部类所属的外部类Server的实例
                synchronized (Server.this) {  //可以
                /*
                    将对应当前客户端的输出流存入allOut,以便其他ClientHandler可以
                    将消息转发给当前客户端。
                 */
                    //1先对allOut数组扩容
//                    allout = Arrays.copyOf(allout, allout.sh + 1);
                    //2将对应当前客户端的输出流存入该数组
//                    allout[allout.length - 1] = pw;
                    allOut.add(pw);
                }


                System.out.println(host+"儿子上线了，当前您有儿子："+ allOut.size());

                String line;
                while((line = br.readLine())!=null) {
                    System.out.println(host + "说:" + line);
                        //遍历allout，将消息回复给每个客户端
                    synchronized (Server.this) {
                        for (PrintWriter o:allOut) {
                            o.println(host + "您的第" + allOut.size() + "号儿子说：" + line);
                        }
                    }
                }
            }catch(IOException e){
                //  e.printStackTrace();
            }finally{
                //当客户端断开后要进行的相关处理
                synchronized (Server.this) {
                    //将客户端的输出流从allout数组当中删除
//                    for (int i = 0; i < allout.length; i++) {
//                        if (allout[i] == pw) {
//                            allout[i] = allout[allout.length - 1];
//                            allout = Arrays.copyOf(allout, allout.length - 1);
//                            break;
//                        }
//                    }
                    allOut.remove(pw);
                }
//                System.out.println(host+"下线了，当前人数："+allout.length);
                System.out.println(host+"下线了，当前人数："+ allOut.size());
                try {
                    socket.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

}
