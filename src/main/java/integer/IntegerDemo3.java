package integer;
/*
JDK1.5之后退出了一个新的特性：自动拆装箱
该特性是编译器认可的，当我们在代码中将基本类型与引用类型之间相互赋值时，编译器会自动补充代码
完成他们之间的转换工作
 */

public class IntegerDemo3 {
    public static void main(String[] args) {
        /*
        触发了编译器的自动拆箱特性，代码会被编译器改为
        int i = new Integer(123).intValue();
         */
        int i = new Integer(123);
        /*
        触发了编译器的自动拆箱特性，代码会被编译器改为
        Integer in = Integer.valueOf(in);
         */

        Integer in = i;
    }
}
