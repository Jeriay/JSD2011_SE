package exception;

/**
 * 测试异常的抛出
 */
public class ThrowDemo {
    public static void main(String[] args){
        System.out.println("程序开始了.....");
        Person p = new Person();
        /*
        当我们调用一个含有throws声明异常抛出的方法时，编译器要求我们必须处理
        这个异常，否则编译不通过。处理的方式有两种：
        1.使用try-catch捕获并处理
        2.在当前方法上继续使用throws声明该异常的抛出
        具体使用哪种取决与异常处理的责任问题。但永远不应当在main方法上写throws
         */
        //满足语法，但是不满足业务的情况
        try {
            p.setAge(2000);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
        System.out.println("此人年龄："+p.getAge());

        System.out.println("程序结束......");


    }
}
