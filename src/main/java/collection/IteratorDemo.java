package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合的遍历
 * Collection提供了遍历集合元素的方法：
 * Iterator iterator()
 * 该方法会返回一个可以遍历当前集合元素的迭代器
 *
 * java.util.Iterator接口，是迭代器接口，规定了遍历集合的相关方法。
 * 不同的集合都提供了一个可以遍历自身元素的迭代器实现类，我们不需要记住这些了实现类的名字，
 * 只当它们是Iterator操作即可。
 *
 * 迭代器遍历集合遵循的原则是：问，取，删。其中删除元素不是必要操作。
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        c.add("#");
        c.add("six");
        c.add("#");
        c.add("seven");
        c.add("#");
        c.add("eigth");
        System.out.println(c);
        /*
        迭代器也支持泛型，用于告知迭代器从集合中获取回来的元素的类型
        注意：这个类型指定的要与集合指定的泛型一致，否则编译不通过
         */

        Iterator<String> it = c.iterator();
        /*
        boolean hasNext()
        问的过程，当集合中还有“下一个”元素时则返回true
        第一次调用时是判断集合是否有第一个元素，以此类推
         */

        while(it.hasNext()){
            /*
            E next()
            取的过程，获取集合中“下一个”元素，
            第一次调用时获取的就是集合中的第一个元素，以此类推
             */
            String str = it.next();
            System.out.println(str);
            //遍历过程中将“#”元素从集合中删除
            if("#".equals(str)){
                /*
                当使用迭代器遍历集合的过程中使用了集合提供的增删元素方法被调用，
                则遍历过程会抛出异常：
                java.util.ConcurrentModificationException
                 */
//                c.remove(str);
                /*
                迭代器提供了remove方法，并且不需要传入参数，删除的是本次通过next方法获取的元素
                 */
                it.remove();
            }


        }
        System.out.println(c);





    }
}
