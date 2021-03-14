package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List接口
 * List集合继承自Collection，是Collection下面最常用的一类集合。
 * List的特点是可以放重复元素且有序，在List接口中定义了一组通过下标操作元素的方法。
 *
 * 常用实现类：
 * java.util.ArrayList:使用数组实现，查询兴能更好。
 * java.util.LinkedList：使用链表实现，增删性能好，首尾增删性能最佳。
 * 在没有对性能有特别苛刻要求下，通常使用ArrayList即可。
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        /*
        E get(int index)
        获取给定下标处对应的元素
         */
        String str = list.get(3);
        System.out.println(str);

        //使用普通for循环遍历List集合
        for (int i = 0; i <list.size() ; i++) {
            str = list.get(i);
            System.out.println(str);
        }
        //使用新方法for遍历list集合
        for(String s : list){
            System.out.println(s);
        }

        /*
        E set(int index,E e)
        将给定元素设置到指定位置，返回值为该位置原来的元素，
        所以set是置换元素操作
         */

        //[one,2,three,four,five]
//        String old = list.set(1,"2");
//        System.out.println(list);
//        System.out.println(old);

        /*
        将集合元素反转
        要求，不能创建新集合
         */

        for(int i=0;i<list.size()/2;i++){
            //获取倒数位置的元素
            String e = list.get(list.size()-1-i);
            //将倒数位置元素设置到正数位置上
            e = list.set(i,e);//将原正数位置元素获取到
            //将原正数位置元素设置到倒数位置上
            list.set(list.size()-1-i,e);
        }
        System.out.println(list);









    }

}
