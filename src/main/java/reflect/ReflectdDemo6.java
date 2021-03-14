package reflect;

import java.lang.reflect.Method;

/**
 * 访问私有成员
 */
public class ReflectdDemo6 {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("reflect.Person");
            Object o = cls.newInstance();

//            Method m = cls.getMethod("hello");//获取不到私有方法
            //获取本类定义的方法，包含私有方法
            Method m = cls.getDeclaredMethod("hello");
            m.setAccessible(true);//强行设置为可访问
            m.invoke(o);



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
