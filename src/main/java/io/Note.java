package io;

import java.io.*;
import java.util.Scanner;

/**
 * 程序启动后要求用户输入文件名，然后对文件进行写操作。
 * 之后用户输入的每行字符串都按行写入到文件中
 * 当用户单独输入exit时程序退出
 *
 * 要求：自行组建流链接
 */
public class Note {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入文件名:");
        String fileName = scanner.nextLine();
        FileOutputStream fos = new FileOutputStream(fileName);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);
        /*
        在流链接中创建PrintWriter时，如果第一个参数指定要链接的流后，可以再
        传入一个boolean值参数，如果这个值为true，则打开了PrintWriter的自动行刷新功能
        即：每当我们调用println方法后就会自动flush
         */
        PrintWriter pw = new PrintWriter(bw,true);

        System.out.println("请开始输入内容,单独输入exit退出");
        while(true){
            String line = scanner.nextLine();
            if ("exit".equals(pw)) {
                break;
            }
            pw.println();

        }
        System.out.println("完毕");
        pw.close();

    }
        /*
        Scanner scanner = new Scanner(System.in);
        out:while(true){
            System.out.println("请输入文件名:");
            String fileName = scanner.nextLine();
            File file = new File(fileName);
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
            System.out.println("请开始输入内容:");
            if(file.exists()){
                System.out.println("该文件已存在,请更换名字");
            }else{
                while(true){
                    String line = scanner.nextLine();
                    if("exit".equals(line)){
                        break;
                    }
                    pw.println(line);
                    pw.close();
                }
            }
        }


    }












    /*
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件名");
        String fileName = new String();
        fileName = sc.nextLine();
        File file = new File(fileName);
        System.out.println("请输入内容，按exit退出");
        while(true) {
            FileOutputStream fos = new FileOutputStream(fileName);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(sc.nextLine());
            pw.println(sc.nextLine());

            if ("exit".equals(pw)) {
                break;
            }
            System.out.println("完毕");
            pw.close();
        }
    }

     */



}
