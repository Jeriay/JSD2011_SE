package io;

import java.io.*;

/**
 * 使用转换流读取文本数据
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("ows.txt");
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");

        int d;
        while ((d=isr.read())!=-1){
            System.out.print((char)d);
        }

        isr.close();
    }
}
