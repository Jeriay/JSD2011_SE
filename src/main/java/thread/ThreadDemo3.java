package thread;

/**
 * 使用匿名内部类完成两种线程的创建方式
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        //第一种创建线程的方式
        Thread t1 = new Thread(){
            public void run(){
                for (int i=0;i<1000;i++){
                    System.out.println("你是谁啊");
                }
            }
        };

        //第二种创建线程的方式
        Runnable r2 = ()->{
            for(int i=0;i<1000;i++){
                System.out.println("我是非洲大美眉!");
            }
        };
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
