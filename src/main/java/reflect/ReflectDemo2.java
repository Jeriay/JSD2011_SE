package reflect;

import java.util.Scanner;

/**
 * 实例化操作
 */
public class ReflectDemo2 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p);

        try {
            //1: 先加载要实例化对象的类的类对象
//            Class cls = Class.forName("reflect.Person");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要实例化类的类名");
            String className = sc.nextLine();
            Class cls = Class.forName(className);

            //2：类对象提供了是实例化对象的方法
            Object o =cls.newInstance(); //注意：必须要无参构造器，且是public的。
            System.out.println(o);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
