package sockert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket server;



    public Server(){
        try {
            System.out.println("启动服务器.....");
            server = new ServerSocket(8088);
            System.out.println("服务器启动完毕！！");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void start() {
        try {
            System.out.println("等待客户端连接...");
            Socket socket = server.accept();
            System.out.println("一个客户端已连接");

            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is,"UTF-8");
            BufferedReader br = new BufferedReader(isr);

            String line = br.readLine();
            System.out.println("客户端说："+line);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Server server = new Server();
        server.start();

    }



}
