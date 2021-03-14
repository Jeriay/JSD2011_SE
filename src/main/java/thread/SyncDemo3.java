package thread;
/**
静态方法上如果使用synchronized修饰，则该方法一定具有同步效果
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                Foo.dosome();
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                Foo.dosome();
            }
        };
        t1.start();
        t2.start();

    }
}

class Foo{
    /**
     * 静态方法上如果使用synchronized，那么同步监视器对象为当前类的类对象（Class的实例）。
     * 注：每个类都有且只有一个类对象与之对应。后面反射的知识点会详细说明。
     */
//    public synchronized static void dosome(){
    public static void dosome(){
        /*
        静态方法中使用同步块时，指定的同步监视器对象通常就使用当前类的类对象，获取方式为：  类名.class
         */
        synchronized (Foo.class) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ":正在执行dosome方法....");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t.getName() + "执行dosome方法完毕！！");
        }
    }
}
