package reflect;

public class Student {
    String name = "王五";
    int age = 25;
    public void study() {
        System.out.println("学个屁");

    }

    public void play() {
        System.out.println("真好玩");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
