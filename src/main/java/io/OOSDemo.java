package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * java.io.ObjectOutputStream和ObjectInputStream
 * 对象流是一对高级流，作用是方便我们读写java中任何类的实例（引用类型）
 *
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        /*
        将Person对象写入文件person.obj中
         */
        String name = "苍老师";
        int age = 18;
        String gender = "女";
        String[] otherInfo = {"是一名演员","台词较少","来自日本","促进中日文化交流","广大男性同胞的启蒙老师"};

        Person p = new Person(name,age,gender,otherInfo);
        System.out.println(p);

        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        /*
        对象输出流提供了写出对象的方法：
        void writeObject(Object obj)
        该方法会自动分析对象内容并将其转换为一组字节后写出。但是有一个前提条件，
        即：写出的对象必须实现了接口：java.io.Serializable否则会抛出如下异常：
        java.io.NotSerializableException

        对象经过对象输出流时：会将该对象按照其结构转换为一组字节
        这个过程称为：对象序列化

        序列化后的字节再经过文件输出流写入文件（写入磁盘）这个过程称为：数据持久化


         */

        oos.writeObject(p);
        System.out.println("写出完毕");

        oos.close();
    }
}
