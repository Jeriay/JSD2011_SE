package raf;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 完成简易记事本工具
 * 程序启动后要求用户输入一个文件名，然后对该文件进行写操作。
 * 之后用户在操控台输入的每一行内容都要写入到文件中。
 * 当用户单独输入“exit”时程序退出。
 *
 * 注：写入文件中的数据不需要考虑换行问题。
 *
 * 用自变量去比较变量
 */
public class Note {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件名");
        String filename = sc.nextLine();
        RandomAccessFile raf = new RandomAccessFile(filename,"rw");
        System.out.println("请输入内容，按exit退出");

        while(true){
            String line = sc.nextLine();
            if("exit".equals(line)){
                break;
            }
            raf.write(line.getBytes("UTF-8"));
            }
        raf.close();
        }
    }

