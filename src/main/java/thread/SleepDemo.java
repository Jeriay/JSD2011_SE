package thread;

import java.util.Scanner;

/**
 * sleep
 *
 * 线程提供了一个静态方法：
 * static void sleep(long ms)
 * 该方法可以让运行这个方法的线程进入阻塞状态指定毫秒。超时后线程会自动回到RUNNABLE状态
 * 等待再次获取时间片并发运行
 *
 */
public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        /*
            完成倒计时程序
            程序启动后要求用户输入一个数字,然后从该数字开始每秒递减并输出.
            到0时输出时间到,然后程序结束.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int time = sc.nextInt();

        System.out.println("开始计时！！");
        try {
            for(int i=time;i>0;i--){
                System.out.println(time--);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("时间到！！");
        System.out.println("程序结束了");
    }
}
