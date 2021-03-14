package file;


import java.io.File;

/*
 * java.io.File
 * File的每一个实例可以表示硬盘上的一个文件或目录
 * 使用File可以:
 * 1:访问该文件或目录的属性信息(名字,大小等)
 * 2:创建,删除文件或目录
 * 3:访问一个目录中的所有子项
 *
 * 但是不能访问文件数据!
 */
public class FileDemo {
    public static void main(String[] args) {
//        File file = new File("C:/Users/30946/IdeaProjects/JSD2011_SE/demo.txt")
        /*
        写程序时需要指定路径时通常使用相对路径，虽然看起来模糊，但是它有更好的跨平台性。
        "./"在相对目录中的意思是"当前目录"，这个目录具体指哪里要视当前程序的运行环境而定。
        对于idea和eclipse而言，当前目录指定的是当前程序所在的项目目录。
         */
        File file = new File("./demo.txt");

        //返回文件的名字
        String name = file.getName();
        System.out.println(name);

        //返回文件的大小（文件占用的字节量）
        long length = file.length();
        System.out.println("大小："+length+"字节");

        boolean cr = file.canRead();
        System.out.println("可读："+cr);
        boolean cw = file.canWrite();
        System.out.println("可写："+cw);
        boolean ih = file.isHidden();
        System.out.println("是否隐藏："+ih);

    }
}
