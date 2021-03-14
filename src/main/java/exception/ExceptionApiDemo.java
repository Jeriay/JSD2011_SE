package exception;

/**
 * 异常常用的方法
 */
public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("程序开始......");

        try{
            String str = "abc";
            System.out.println(Integer.parseInt(str));
        }catch(Exception e){
            System.out.println("出错了");
            //将错误信息输出到控制台
            e.printStackTrace();
            //获取错误消息，常用于记录日志和提示给用户使用
            String message = e.getMessage();
            System.out.println(message);
        }

        System.out.println("程序结束......");
    }
}
