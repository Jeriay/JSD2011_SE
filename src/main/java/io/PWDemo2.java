package io;

import java.io.*;

/**
 * 使用流链接创建PrintWriter
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        FileOutputStream fos = new FileOutputStream("pw2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println("你个***");
        pw.println("**你个大**");
        System.out.println("完毕");
        pw.close();

    }
}
