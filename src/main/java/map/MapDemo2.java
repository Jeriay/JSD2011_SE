package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map的遍历
 * Map提供了三种遍历方式：
 * 1.遍历所有的key
 * 2.遍历所有的键值对
 * 3.遍历所有的value（该操作相对不常用）
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("语文",88);
        map.put("数学",99);
        map.put("化学",88);
        map.put("物理",95);
        map.put("生物",97);
        System.out.println(map);
        /*
        遍历Map中所有多有的key
        Set keySet()
        将当前Map中所有的key以一个Set集合形式返回
         */
        Set<String> keySet = map.keySet();
        for(String key : keySet){
            System.out.println("key:"+key);
        }

        /*
        遍历每一组键值对
        Set<Entry> entrySet()
        将当前Map中每一组键值对（一个Entry实例）存入一个Set集合并将其返回

        java.util.Map.Entry 它的每一个实例表示Map中的一组键值对
         */

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for(Map.Entry<String,Integer> e : entrySet){
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+":"+value);
        }

        Collection<Integer> values = map.values();
        for(Integer value : values){
            System.out.println("value:"+value);
        }



    }
}
