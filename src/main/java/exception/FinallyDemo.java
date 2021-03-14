package exception;

/**
 * finally块
 * finally是异常处理机制的最后一块，即：可以直接跟在try之后或者最后一个catch之后。
 * finally可以保证只要程序执行到try语句块中，无论try语句块中的代码是否抛出
 * 异常，finally都必定执行
 * 我们可以将释放资源登操作放在finally中确保执行
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始.......");
        try{
            String str = "";
            System.out.println(str.length());
            return;//方法实际return前要先将finally执行完
        }catch(Exception e){
            System.out.println("出错了");
        }finally{
            System.out.println("fianlly中的代码执行");
        }
        System.out.println("程序结束");

    }
}
