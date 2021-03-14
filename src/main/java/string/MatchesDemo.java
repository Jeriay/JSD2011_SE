package string;

/**
 * String支持正则表达式的方法之一：
 * boolean matcher(String regex)
 * 使用给定的正则表达式验证当前字符串是否符合格式要求
 * 注意！给定的正则表达式就算不加边界匹配符也是做全匹配验证的
 */
public class MatchesDemo {
    public static void main(String[] args) {
        /*
        邮箱的正则表达式：
        [a-zA-Z0-9_]+@[a-zA-Z0-9]+（\.[a-zA-Z]+）+
         */
        String email = "fancq@tedu.cn";
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+（\\.[a-zA-Z]+）+";
        boolean match = email.matches(regex);
        if(match){
            System.out.println("是邮箱");
        }else{
            System.out.println("不是邮箱");
        }
    }
}
