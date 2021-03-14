package string;

/**
 * String支持正则表达式的方法之三：
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定内容
 */
public class ReplaceAllDemo{
    public static void main(String[] args) {
        String str = "abc123def456ghi";
        //将数字部分换成"#NUMBER#"
        str=str.replaceAll("[0-9]+","XXXXXX");
        System.out.println(str);
    }
}
