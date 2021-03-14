package reflect;

/**
 * 使用当前类测试反射机制
 */
public class Person {
    private String name = "张三";
    private int age = 25;

    public Person(){
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHello(){
        System.out.println(name+"大家好！");

    }

    public void sayHi() {
        System.out.println(name+"hi!!!");
    }

    public void say(String info) {
        System.out.println(name + ":" + info);
    }

    public void say(String info, int sum) {
        for (int i = 0; i < sum; i++) {
            System.out.println(name + ":" + info);
        }
    }

    private void hello() {
        System.out.println("我是Person的私有方法，还是你爸爸！！！！");
    }




    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
