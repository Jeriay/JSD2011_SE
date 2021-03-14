package thread;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 获取线程相关信息的方法
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {
        //获取主线程
        Thread main = Thread.currentThread();
        String name = main.getName();
        System.out.println("name:"+name);

        long id = main.getId();
        System.out.println("id:"+id);

        int priority = main.getPriority();
        System.out.println("优先级："+priority);

        //线程是否活着
        boolean isAlive = main.isAlive();
        //线程是否为守护线程
        boolean isDaemon = main.isDaemon();
        //线程是否被重锻了
        boolean isInterrupted = main.isInterrupted();

        System.out.println("isAlive:"+isAlive);
        System.out.println("isDaemon:"+isDaemon);
        System.out.println("isInterrupted:"+isInterrupted);

    }
}











