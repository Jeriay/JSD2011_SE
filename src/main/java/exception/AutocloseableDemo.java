package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK7之后，java推出了一个新的特性：自动关闭
 * 可以在异常处理机制中用更精简的代码完成在finally中的IO关闭
 */
public class AutocloseableDemo {
    public static void main(String[] args) {
        try (
            FileOutputStream fos = new FileOutputStream("fos.dat");
        ){
            String str = "";
            fos.write(1);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
