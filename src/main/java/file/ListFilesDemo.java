package file;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        //获取当前目录下的所有内容
        File dir = new File(".");
        /*
        boolean isFile()
        boolean isDirectory()
         */
        if(dir.isDirectory()){
            File[] subs = dir.listFiles();
            System.out.println(subs.length);
            for(int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }
    }
}
