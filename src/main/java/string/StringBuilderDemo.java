package string;

/**
 * StringBuilder
 * 由于String的优化完全是基于重用性考虑的，带来的问题是频繁的修改会产生内存开销大，
 * 运行速度慢等问题
 * 为了解决这些问题java推出了一个专门用来修改字符串的API:StringBuilder
 * StringBuilder内部维护一个可变的char数组，修改某个字符串时会先将该字符串内容复
 * 制到内部的数组
 * 中然后进行修改。并且提供了便于修改字符串的相关操作:增删改插，以及String中操作字
 * 符串的功能。
 *
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "好好学习java";
        //默认表示一个空字符串
//        StringBuilder builder = new StringBuilder();
        //将给定的字符串内容复制到StringBuilder内部，基于它进行修改
//        StringBuilder builder = new StringBuilder(str);
        StringBuffer builder = new StringBuffer(str);
        /*
            好好学习java
            好好学习java,为了找个好工作!
            append():追加操作
         */
        builder.append(",为了找个好工作!");
        String s = builder.toString();
        System.out.println(s);
        /*
            好好学习java,为了找个好工作!
            好好学习java,就是为了改变世界!
            replace():替换,将指定范围内的字符串替换为给定字符串
         */
        builder.replace(9,16,"就是为了改变世界");
//        System.out.println(builder.toString());
        System.out.println(builder);

        /*
            好好学习java,就是为了改变世界!
            ,就是为了改变世界!
            delete():删除，删除指定范围内的字符串
         */
        builder.delete(0,8);
        System.out.println(builder);

        /*
            ,就是为了改变世界!
            活着,就是为了改变世界!
            insert():在指定位置插入给定字符串
         */
        builder.insert(0,"活着");
        System.out.println(builder);


    }
}



