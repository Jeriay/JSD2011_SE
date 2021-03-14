package string;

/**
 * String toLowerCase()
 * String toUpperCase()
 * 将当前字符串中的英文部分转换为全小写或全大写
 */

public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str);

        String upper = str.toUpperCase();
        System.out.println(upper);

        String lower = str.toLowerCase();
        System.out.println(lower);
    }
}
