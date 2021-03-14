package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 通过提高每次读写的数据量,减少读写次数可以提高读写效率.
 * 单字节读写是随机读写形式
 * 一组字节读写是块读写.
 * 使用块读写方式明显性能高于随机读写.
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("205.mp4","r");
        RandomAccessFile desc = new RandomAccessFile("205_52.mp4","rw");

        /*
            int read(byte[] data)
            一次性从文件中读取给定的字节数组总长度的字节量,并存入到该数组中.返回值为实际
            读取到的字节量.如果返回值为-1则表示EOF

            文件数据:
            10100011 00111010 11010101 11010001 11100001 10001010 11100010
            单字节读取
            int d = raf.read();//读取一个字节
            d:00000000 00000000 00000000 10100011  文件中第一个字节的内容

            对比块读取
            byte[] data = new byte[4];//[00000000,00000000,00000000,00000000]
            int d = raf.read(data);//连续读取4个字节并存入到data数组中

            data:[10100011,00111010,11010101,11010001]//文件中前四个字节都在数组中
            d:4(10进制)  表示实际读取到了4个字节

            块写方法:
            void write(byte[] data)
            一次性将给定字节数组中的所有字节写入文件

            void write(byte[] data,int offset,int len);
            将给定字节数组从下标offset处开始的连续len个字节一次性写入文件
         */

        /*
            00000000   1byte   1字节
            1024byte   1kb
            1024kb     1mb     1兆
            1024mb     1gb
         */
        byte[] data = new byte[1024*10];//10kb
        int len;//记录每次实际读取到的字节数

        long start = System.currentTimeMillis();
        while ((len=src.read(data))!=-1){
            desc.write(data,0,len);
        }
//        while((len = src.read(data))!=-1){
//            desc.write(data,0,len);
//        }
        long end = System.currentTimeMillis();

        System.out.println("复制完毕!,耗时:"+(end-start)+"ms");
        src.close();
        desc.close();


    }
}

