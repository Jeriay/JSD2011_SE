package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 有条件的获取一个目录中的部分子项
 *
 * 重载的方法：
 * File[] listFiles(FileFilter filter)
 * 获取该目录中满足给定过滤器要求的所有子项
 *
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        //获取当前目录中所有的文本文件（特点：文件名是以".txt"结尾的）
        File dir = new File("./");
        if(dir.isDirectory()){

            //匿名内部类创建文件过滤器
//            FileFilter filter = new FileFilter() {
//                public boolean accept(File file) {
//                    //只接受文件名是以".txt"结尾的文件
//                    return file.getName().endsWith(".txt");
//                }
//            };
//            File[] subs = dir.listFiles(filter);


            File[] subs = dir.listFiles(new FileFilter(){
                    public boolean accept(File file){
                        //只接受文件名是以".txt"结尾的文件
                     return file.getName().endsWith(".txt");
            }
            });

            System.out.println(subs.length)

            ;
            for(int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }

    }
}
