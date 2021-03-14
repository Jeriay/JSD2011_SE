package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 完成用户注册功能
 * 程序启动后，要求用户输入：用户名，密码，昵称和年龄
 * 然后将该用户信息写入文件user.dat中
 *
 *设计
 * 每条记录占用100字节，其中用户名，密码，昵称各占32字节，年龄时int值固定占4字节
 * 字符串故意留白可以方便后期的修改，并且可以让长度固定，统一，便于读取
 *
 */
public class RegDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎注册！");
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        System.out.println("请输入昵称：");
        String nickname = sc.nextLine();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        System.out.println(username+","+password+","+nickname+","+age);

        RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
        //先将指针移动到文件末尾，以便追加记录
        raf.seek(raf.length());

        //写用户名
        byte[] data = username.getBytes("UTF-8");
        data = Arrays.copyOf(data,32);
        raf.write(data);


        //写密码
        data = password.getBytes("UTF-8");
        data = Arrays.copyOf(data,32);
        raf.write(data);

        //写昵称
        data = nickname.getBytes("UTF-8");
        data = Arrays.copyOf(data,32);
        raf.write(data);

        //写年龄
        raf.writeInt(age);
        System.out.println("注册完毕！");
        raf.close();









    }
}
