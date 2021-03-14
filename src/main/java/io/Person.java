package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 用当前类测试对象流的对象读写操作
 *
 * 当一个类的实例希望被对象输出流写出时，该类必须实现Serializable接口
 * 这个接口没有任何抽象方法，它称为“签名接口”，是编译器敏感的一个接口。
 * 当一个类实现了这个接口时，编译器则认为它的实例希望被序列化，因此在编译为class
 * 文件时会添加一个方法，用于将当前对象转换为一组字节，对象输出流就是基于
 * 这个方法将对象转换为一组字节后写出的
 *
 */
public class Person implements Serializable {
    private String name;
    private int age;
    private String gender;
    /*
    当一个属性被transient修饰后，那么对象在序列化时会忽略这个属性的值。
    忽略不必要的属性可以达到对象瘦身的目的，减少资源开销。
     */
    private transient String[] otherInfo;

    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}
