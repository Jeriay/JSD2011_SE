package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map 查找表
 * Map是非常常用的数据结构，它体现的样子是一个多行两列的表格。
 * 左列称为key，右列称为value
 * Map总是根据key获取对应的value
 *
 * 常用实现类：java.util.HashMap 使用散列算法实现的Map，一般称它为
 *            散列表或哈希表。它也是当今查询速度最快的数据结构
 *
 *
 */
public class MapDemo {
    public static void main(String[] args) {
        /*
        Map使用时要对key和value分别指定泛型
         */
        Map<String,Integer> map = new HashMap<>();
        /*
        V put（K k,V v）
        将一组键值对存入Map中

        Map有一个要求：key不允许重复（equals比较）
        如果使用重复的key存入value时则时替换value操作。那么put方法的返回值为这个key原来的value
        如果这个key不存在则返回值为null。

        获取put方法返回值时，如果value的类型时包装类，那么尽量不要用基本类型去接受，
        因为方法可能返回null，如果出现自动拆箱会导致空指针。
         */
        Integer num = map.put("语文",88);
        System.out.println(num);
        map.put("数学",99);
        map.put("化学",88);
        map.put("物理",95);
        map.put("生物",97);
        System.out.println(map);

        num = map.put("数学",55);
        System.out.println(num);
        System.out.println(map);

        /*
        V get（Object key）
        根据key获取Map中对应的value
        如果给定的key不存在则返回值为null
         */
        num = map.get("化学");
        System.out.println("化学:"+num);

        num = map.get("打架");
        System.out.println("打架："+num);

        num = map.remove("生物");
        System.out.println(map);
        System.out.println(num);

        int size = map.size();
        System.out.println("size:"+size);

        //判断Map是否包含给定的key
        boolean ck = map.containsValue("化学");
        System.out.println("包含key："+ck);
        //判断Map是否包含给定的value
        boolean cv = map.containsValue(97);
        System.out.println("包含value："+cv);

    }
}
