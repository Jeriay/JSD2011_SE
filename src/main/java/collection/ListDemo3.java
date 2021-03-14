package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了获取子集的方法：
 *
 * List subList(int start,int end)
 * 获取当前集合中指定下标范围内的自己（含头不含尾）
 *
 */
public class ListDemo3 {
    public static void main(String[] args) {
        //泛型只能指定引用类型，对于基本类型而言要指定对应的包装类
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);
        //获取3-7部分
        List<Integer> subList = list.subList(3,8);
        System.out.println(subList);

        //将子集中每个元素扩大10倍
        for(int i=0;i<subList.size();i++){
            int num = subList.get(i);
            num*=10;
            subList.set(i,num);
        }
        System.out.println(subList);
        System.out.println(list);

        //删除list集合中2-8的元素
        list.subList(2,9).clear();
        System.out.println(list);


    }
}
