package thread;

/**
 * 当sleep方法要求必须处理重锻异常InterruptedException
 * 当一个线程调用该方法处于睡眠阻塞的过程中，其中断方法interrupt()被调用时，
 * 此时该线程的睡眠阻塞会被重锻,sleep方法就会抛出中断异常。
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread(){
            public void run(){
                System.out.println("林：刚做完，睡一觉.......");
                try {
                    Thread.sleep(500000);
                } catch (InterruptedException e) {
                    System.out.println("林：干嘛呢！干嘛呢！干嘛呢！弄死你！！");
                }System.out.println("林：醒了");
            }
        };

        Thread huang = new Thread(){
            public void run(){
                System.out.println("黄：大锤80！小锤40！开始砸喽！！！");
                for(int i=0;i<6;i++){
                    System.out.println("黄：80！");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("咣当！");
                System.out.println("黄：搞定！！");
                lin.interrupt();
            }
        };
        lin.start();
        huang.start();

    }
}
