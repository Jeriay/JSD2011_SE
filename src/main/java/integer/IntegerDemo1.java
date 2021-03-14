package integer;

/**
 * 8个基本类型有对应的8个包装类
 * 包装类出现的目的是为了解决基本类型不能直接参与面向对象开发的问题，使的我们可以以"对象"的形式表示一个基本类型数据
 *
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        //基本类型转换为其对应的包装类
        //Integer i1 = new Integer(1);
        //Integer i2 = new Integer(1)
        //java推荐使用valueOf创建包装类
        Integer i1 = Integer.valueOf(1);
        Integer i2 = Integer.valueOf(1);
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));


        //包装类转换为基本类型
        int d = i1.intValue();
        System.out.println(d);

        double dou = i1.doubleValue();
        System.out.println(dou);

    }
}
