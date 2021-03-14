package integer;

public class IntegerDemo2 {
    public static void main(String[] args) {
        //数字类型的包装包提供了两个常量用于获取对应的基本类型的取值范围
        int imax = Integer.MAX_VALUE;
        System.out.println(imax);
        int imin = Integer.MIN_VALUE;
        System.out.println(imin);

        long lmax = Long.MAX_VALUE;//long最大值


        String str = "123";
     //   String str = "123.123";
        /*
        对于123.123而言，Integer就不能将它解析为整数了，会抛出异常
        因此注意：包装类在解析字符串时要求该字符串必须正确的描述了基本类型可以保存的值
        否则会抛出NumberFormatException.即：数字格式异常
         */
        int i = Integer.parseInt(str);
        System.out.println(i);
        double dou = Double.parseDouble(str);
        System.out.println(dou);
    }

}
