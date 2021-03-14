package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转换为数组
 *
 * Collection提供了一个方法：toArray(),可以将当前集合转换为一个数组。
 */
public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);

//        Object[] array= c.toArray();
        /*

        重载的toArray方法要求传入一个数组，该数组的类型要与集合存放元素的类型一致
        传入的数组长度没有要求，但是尽量不要小于集合的size

         */
        String[] array = c.toArray(new String[c.size()]);
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));

    }
}


















