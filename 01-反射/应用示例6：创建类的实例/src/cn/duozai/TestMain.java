package cn.duozai;

import cn.duozai.entity.Person;

import java.lang.reflect.Constructor;

/**
 * 测试类
 *
 * @author 多仔ヾ
 */
public class TestMain {

    public static void main(String[] args) throws Exception {
        // 获取Person用户类的Class实例
        Class clz = Class.forName("cn.duozai.entity.Person");

        // new的方式实例化Person对象
        Person person1 = new Person();
        System.out.println("person1 = " + person1);

        // 使用Class实例的newInstance方法实例化Person对象
        Object person2 = clz.newInstance();
        System.out.println("person2 = " + person1);

        // 使用Constructor实例创建Person对象
        // 通过Class实例获取指定的构造函数
        Constructor constructor1 = clz.getDeclaredConstructor(String.class);
        // 允许访问私有构造函数 private Person(String name){...}
        constructor1.setAccessible(true);
        // 通过构造函数创建实例
        Object person3 = constructor1.newInstance("多仔");
        System.out.println("person3 = " + person3);
    }

}
