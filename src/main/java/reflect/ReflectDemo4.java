package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 调用方法
 */
public class ReflectDemo4 {
    public static void main(String[] args) {
        Person p = new Person();
        p.sayHello();

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入类名：");
            String className = sc.nextLine();

            System.out.println("请输入方法名");
            String methodName = sc.nextLine();
//            Class cls = Class.forName("reflect.Person");
            Class cls = Class.forName(className);
            Object o = cls.newInstance();

            //获取sayHello方法
//            Method method = cls.getMethod("sayHello");
            Method method = cls.getMethod(methodName);
            method.invoke(o);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
