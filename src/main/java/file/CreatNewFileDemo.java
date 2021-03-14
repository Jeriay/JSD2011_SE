package file;

import java.io.File;
import java.io.IOException;

/**
 * 创建一个新文件
 */

public class CreatNewFileDemo {
    public static void main(String[] args) throws IOException {
        /*
        在当前目录下新建一个文件:test.txt
         */
//        File file = new File("./test.txt");
        //在相对路径中"./"可以忽略不写，默认就是在当前目录下
        File file = new File("test.txt");
        if(file.exists()){
            System.out.println("该文件已存在！");
        }else{
            file.createNewFile();
            System.out.println("该文件已创建！！");
        }

    }
}
