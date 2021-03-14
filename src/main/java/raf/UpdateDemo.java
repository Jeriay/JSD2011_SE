package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 修改昵称功能
 * 程序启动后，要求用户输入用户名和新昵称，然后将user.dat文件中该用户的昵称进行修改。如果
 * 输入的用户名不存在则输出"查无此人"
 *
 * 思路：
 * 首先循环读取user.dat文件中每个用户名并进行对比，如果找到该用户则将指针移动到该条记录
 * 的昵称位置，然后将新的昵称转换为字节数组后扩容到32字节并写入来覆盖原昵称信息
 *
 */
public class UpdateDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名字：");
        String username = sc.nextLine();
        System.out.println("请输入昵称");
        String nickname = sc.nextLine();

        RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
        boolean updata = false;
        for(int i=0;i<raf.length()/100;i++){

        }







    }



















    /*
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = scanner.nextLine();
        System.out.println("请输入新昵称:");
        String nickname = scanner.nextLine();

        RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
        boolean update = false;//是否有记录被修改过
        for(int i=0;i<raf.length()/100;i++){
            raf.seek(i*100);//每次读取前先将指针移动到该条记录的开始位置
            //读取用户名
            byte[] data = new byte[32];
            raf.read(data);
            String name = new String(data,"UTF-8").trim();
            if(name.equals(username)){
                //该昵称
                raf.seek(i*100+64);
                //将新昵称写入
                data = nickname.getBytes("UTF-8");
                data = Arrays.copyOf(data,32);
                raf.write(data);
                update = true;//有记录已经修改
                break;
            }
        }
        if(update){
            System.out.println("昵称修改完毕!");
        }else{
            System.out.println("查无此人!");
        }

    }



*/
}
