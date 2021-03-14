package file;

import java.io.File;

/**
 * 删除目录
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        File dir = new File("demo");
        if(dir.exists()){
            /*
            delete删除目录有一个前提条件：目录必须是空的才可以删除
             */
            dir.delete();
            System.out.println("目录已删除！！");
        }else{
            System.out.println("目录不存在！！");
        }
    }
}
