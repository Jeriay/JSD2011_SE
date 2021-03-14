package string;

/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * 判断当前字符串是否是以给定的内容开始或结束的
 */

public class StartsWithDemo {
    public static void main(String[] args) {
        String str = "www.tedu.cn";

        boolean start = str.startsWith("www.");
        System.out.println("startsWith:"+start);  //true

        boolean ends = str.endsWith(".cn");       //true
        System.out.println("endsWith:"+ends);
    }
}
