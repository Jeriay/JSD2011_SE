package io;

import java.io.*;

/**
 * 高级流
 * 如果我们把低级流想象成为“水管”，那么高级流就是链接在水管商对水做加工的各种设备，
 * 比如“热水器”，“净水器”。使得我们在读写数据的过程中当数据经过它们时就已经做好了
 * 相应的处理工作，简化我们对数据的相关操作
 *
 * 实际开发中我们经常会串联一组高级流并最终链接在某个低级流上，可以很轻松的实现
 * 复杂数据的读写。
 *
 * 缓冲流：java.io.BufferedInputStream和BufferedOutputStream
 * 缓冲字节输入流与输出流是常用的一对高级流，在流链接中的作用是加快读写数据的效率
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("205.mp4");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("205_14.mp4");
        BufferedOutputStream bos = new BufferedOutputStream(fos);


        int d;
        long start = System.currentTimeMillis();
        /*
        缓冲流内部有一个字节数组，无论我们进行何种读写方式，最终都会被缓冲流转换为块读写的
        方式来保证读写效率。其内部的字节数组默认为8K
         */

        while((d=bis.read())!=-1){
            bos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕！耗时："+(end-start)+"ms");
        bis.close();
        bos.close();
    }
}

