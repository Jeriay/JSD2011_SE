package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 *
 * 数组的工具类：java.util.Arrays提供了一个静态方法：asList
 * 可以将当前数组转换为一个List集合
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        System.out.println("array:"+ Arrays.toString(array));

        List<String> list = Arrays.asList(array);
        System.out.println("list:"+list);

        list.set(1,"six");
        System.out.println("list:"+list);
        System.out.println("array:"+Arrays.toString(array));

        /*
        由于数组是定长的，因此会改变数组长度的操作都是不被允许的
        因此我们不能调用集合的如：add,remove这样的方法，
        否则会抛出异常：java.lang.UnsupportedOperationException
         */
//        list.add("seven");
//        System.out.println("list:"+list);
//        System.out.println("array:"+Arrays.toString(array));
            /*
            当需要对集合元素做增删操作时，只能自行创建一个集合并将数组转换的集合元素全部导入后方可操作
             */
//        List<String> list1 = new ArrayList<>();
//        list.addAll(list);
        /*
        所有集合都支持一个参数为Collection的构造器，
        作用时在创建当前集合的同时包含给定集合中的所有元素，
        下面这个实例化过程等同上面两句的操作
         */

        List<String> list1 = new ArrayList<>(list);
        list1.add("seven");
        System.out.println("list1:"+list1);





    }
}
