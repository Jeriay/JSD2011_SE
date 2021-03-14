package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件的复制
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("./1234.doc", "r");
        RandomAccessFile desc = new RandomAccessFile("./12345.doc", "rw");

        int d;
        long start = System.currentTimeMillis();
        while ((d = src.read()) != -1) {
            desc.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕！！耗时"+(end-start)+"ms");
        src.close();
        desc.close();
    }
}
