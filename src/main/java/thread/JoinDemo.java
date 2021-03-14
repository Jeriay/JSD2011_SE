package thread;

/**
 * 线程提供了以恶方法：join，可以用来协调线程之间的同步运行
 *
 * 同步运行：多个线程执行存在先后顺序
 * 异步运行：多个线程各干各的，互不打扰。并发本身就是异步的。
 *
 * join方法可以让调用这个方法的线程进入阻塞状态，知道方法所属线程结束后才会解除阻塞。
 *
 *
 */
public class JoinDemo {
    //表示图片是否下载完毕
    public static boolean isFinish=false;
    public static void main(String[] args) {
        /*
        当一个方法的局部内部类中想使用这个方法的其他局部变量时，这个变量必须时final的，
        这源自JVM的内存分配问题。
         */
        Thread download = new Thread(){
            public void run(){
                System.out.println("down：开始下载图片......");
               for(int i=0;i<=100;i++){
                   System.out.println("down:"+i+"%");
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
                System.out.println("down：图片下载完毕");
               isFinish = true;
            }
        };

        Thread show = new Thread(){
            public void run() {
                try {
                    System.out.println("show:开始显示文字......");
                    Thread.sleep(4000);
                    System.out.println("show:文字显示完毕！！");

                    //应当先等待download工作完毕
                    //想办法阻塞show线程
                    download.join();

                    System.out.println("show：开始显示图片");
                    if (!isFinish) {
                        throw new RuntimeException("图片加载失败！！");
                    }
                    System.out.println("show:显示图片完毕！！");


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            };

        download.start();
        show.start();


    }
}
