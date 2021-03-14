package io;

import jdk.nashorn.api.scripting.URLReader;

import java.io.*;

/**
 * 使用文件流完成文件的复制操作
 *思路：
 * 1.创建一个文件输入流读取原文件
 * 2.创建一个文件输出流用于写复制的文件
 * 3.利用块读写的方法循环从原文件一次读取10k数据并写入到复制文件中
 * 4.复制完毕后关闭两个流
 *
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream pos = new FileInputStream("./demo.txt");
        FileOutputStream dpos = new FileOutputStream("./demo_cp.txt");
        int len;
        byte[] data = new byte[1024*10];

        while((len=pos.read(data))!=-1){
            dpos.write(data,0,len);
        }
        System.out.println("复制完毕");

        pos.close();
        dpos.close();



    }
}
