package string;

/**
 * String substring(int start,int end)
 * 截取当前字符串中指定范围内的字符串，两个参数分别为开始的下标和结束的下标位置。
 * 注：在java API中通常使用两个数字表示范围时都是”含头不含尾“
 */

public class Substring {
    public static void main(String[] args) {
        //             01234567890
        String host = "www.tedu.cn";
        //获取域名
        String name = host.substring(4,8);
        //System.out.println(name);   //tedu

        name=host.substring(4);
        //System.out.println(name);   //tedu.cn



        String name1 = getHostName("http://www.tedu.cn");
        System.out.println(name1);
        String name2 = getHostName("doc.canglaoshi.org");
        System.out.println(name2);
        String name3 = getHostName("www.tts.com.cn");
        System.out.println(name3);

    }
    public static String getHostName(String address){
        //完成方法内容,返回address中的域名部分
        int start = address.indexOf(".")+1;//找到第一个“.”之后第一个字符的位置
        int end = address.indexOf(".",start);//找到第二个“.”的位置
        return address.substring(start,end);
    }
}
