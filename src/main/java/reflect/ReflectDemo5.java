package reflect;

import java.lang.reflect.Method;

/**
 * 调用有参方法
 */
public class ReflectDemo5 {
    public static void main(String[] args) {

        try {
            Class cls = Class.forName("reflect.Person");
            Object o = cls.newInstance();

            Method method = cls.getMethod("say", String.class);
            method.invoke(o, "hello~");

            Method method1 = cls.getMethod("say", String.class, int.class);
            method1.invoke(o, "hehe~~~~", 5);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
