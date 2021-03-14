package object;

/**
 * 测试Object中常被重写的toString和equals方法的作用
 */
public class Demo {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        /*
            System.out.println(Object o)
            该方法将给定对象输出到控制台时，会调用这个对象的toString方法将其转换为String
            后再进行输出。
            如果输出一个对象到控制上的内容不符合你的预期时，就应当重写toString方法，在返回
            的字符串中包含你希望的数据。通常原则上应当包含该对象的属性信息。

            Object的toString默认返回的格式为：类名@地址
         */
        System.out.println(p);
        /*
            String和任何类型链接结果都是字符串。当String和其他引用类型链接时，会调用该
            引用类型对象的toString方法将其转换为字符串后再进行链接。
         */
        String str = "Point:" + p;
        System.out.println(str);


        Point p2 = new Point(1,2);
        System.out.println(p2);

        System.out.println(p == p2);//false  并非同一个对象，因此地址不同
        /*
            Object定义的equals方法意图是让子类在使用的时候重写来赋予其实际意义。
            这个方法应当是用来比较相同类型的两个实例的内容是否一致的。
            但是Object本身的实现是用"=="比较的，因此不重写就失去了实际意义。
         */
        System.out.println(p.equals(p2));//true



    }
}
