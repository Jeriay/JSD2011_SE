package string;

/**
 * int indexOf(String str)
 * 返回给定字符串在当前字符串中的位置，
 * 如果当前字符串不包含给定内容则返回值为-1
 */

public class IndexOfDemo {
    public static void main(String[] args) {
        //            0123456789012345
        String str = "thinking in java";

        //从指定位置开始检索第一次出现给定字符的位置
        int index=str.indexOf("in");
        System.out.println(index);  //2

        //最后一次出现给定字符的位置
        index = str.lastIndexOf("in");
        System.out.println(index); //9
    }
}
