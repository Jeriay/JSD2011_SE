package io;

import java.io.*;

/**
 * 缓冲输出流写出数据的缓冲区问题
 */
public class Bos_flushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("**你个**个大**".getBytes("UTF-8"));
        /*
        void flush()
        flush方法可以强制将缓冲流中已经缓存的数据一次性写出
        频繁调用该方法会降低写出数据的效率，但是可以达到写出数据的即时性。
        */
        bos.flush();

        System.out.println("写出完毕！");
        bos.close();
    }
}
