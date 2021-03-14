package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

/**
 * java.io.RandomAccessFile
 * RAF是专门设计用来读写文件数据的API，其基于指针对文件进行随机读写
 */
public class RAFDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        RandomAccessFile有两种构造器
        RandomAccessFile(File file,String mode)
        RandomAccessFile(String path,String mode)
        第一个参数为要操作的文件（File）对象或直接给路径均可
        第二个参数为对文件的操作模式：
        r：只读模式，仅对文件进行读取操作
        rw：读写模式，对文件数据又能读又能写
        */
        RandomAccessFile raf = new RandomAccessFile("./raf.dat","rw");
        /*
        void write(int d)
        向文件中写入一个字节，写入的是指定的int值所对应的2进制的"低八位"

        00000000 00000000 00000000 00000001
         */
        raf.write(255);
        raf.write(98);
        raf.write(99);

        System.out.println("写出完毕！！");
        raf.close();



    }
}
