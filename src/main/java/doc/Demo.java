package doc;

/**
 * 文档注释,文档注释是功能级注释,用来说明一个类,或方法或常量的作用.
 * 因此只在以上三处使用.
 *
 * 在类上使用时,用来说明当前类的整体功能.
 *
 * @author 作者
 *
 */
public class Demo {



















    /*
    /**
     * sayHello方法用到的问候语
     */
    public static final String INFO = "你好啊!";
    /**
     * 为给定的用户添加问候语
     * @param name  给定的用户名
     * @return  返回含有问候语的字符串
     */
    public String sayHello(String name){
        return "你好啊!"+name;
    }

}
