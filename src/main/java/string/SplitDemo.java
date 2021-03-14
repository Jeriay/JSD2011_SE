package string;

import java.util.Arrays;

/**
 * String支持正则表达式的方法之二：
 * String[] split(String regex)
 * 将当前字符串按照正则表达式的部分进行拆分，将拆分后的每部分以数组形式返回
 */
public class SplitDemo {
    public static void main(String[] args) {
//        String str = "abc313def563ghi";
//        String[] arr = str.split("[0-9]+");
        /*
        如果连续出现可拆分项，则中间会拆分出一个空字符串，如果字符串在开始就是可拆分项则首先会拆分出一个空字符串
        注意：如果在字符串末尾连续匹配到可拆分项，所有拆分出的空字符串都会被忽略+
         */
        String str = ".abc.def.ghi";
        String[] arr = str.split("\\.");
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
