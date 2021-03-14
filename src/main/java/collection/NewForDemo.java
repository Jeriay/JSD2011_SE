package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 新循环
 * JDK 5之后退出了一个特性：增强型for循环，也称为新循环。
 * 新循环不取代传统的for循环工作，它仅用来使用相同的语法遍历集合或数组
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        for (int i=0;i<array.length;i++){
            String str = array[i];
            System.out.println(str);
        }
        /*
        新循环这个特性是编译器认可的，而非虚拟机。
        编译器在编译代码时会将新循环遍历数组改为传统的for循环遍历
         */
        for(String str : array){
            System.out.println(str);
        }


        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        /*
        使用新循环遍历集合时，编译器会将代码改为使用迭代器进行遍历。
        所以要注意，遍历的过程中不能使用集合的方法增删元素，否则会抛出异常。
         */

        for(String str:c){
            System.out.println(str);
        }




    }
}
