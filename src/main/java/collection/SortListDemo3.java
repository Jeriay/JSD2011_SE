package collection;

import java.util.*;

/**
 * 当元素已经实现了Comparable接口，但是该比较规则不满足我们排序需求时，
 * 也可以用重载的sort方法排序
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("平如");
//        list.add("苍井空");
//        list.add("MiMi");
//        list.add("jiji");
//        list.add("gaga");
//        list.add("Leisi");


        list.add("品如");
        list.add("苍井空");
        list.add("泷泽萝拉");
        list.add("范斯特");
        System.out.println(list);
//        Collections.sort(list);
        //自定义比较器，按照字符多少排序字符串

            //(1)第一种方法
//        Collections.sort(list, new Comparator<String>(){
//            public int compare(String o1,String o2){
//                return o1.length()-o2.length();
//            }
//        });
//        System.out.println(list);

        //（2）第二种方法
        Collections.sort(list,(o1,o2)->o1.length()-o2.length());
        System.out.println(list);

    }
}
