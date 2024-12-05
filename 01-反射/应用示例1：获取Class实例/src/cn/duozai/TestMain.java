package cn.duozai;

import cn.duozai.entity.Person;

/**
 * 测试类
 *
 * @author 多仔ヾ
 */
public class TestMain {

    public static void main(String[] args) throws ClassNotFoundException {
        // 方法1：调用对象的getClass方法
        Person person = new Person();
        Class clazz1 = person.getClass();

        // 方法2：调用类或接口的 class 属性
        Class clazz2 = Person.class;

        // 方法3：调用 Class.forName 方法
        Class clazz3 = Class.forName("cn.duozai.entity.Person");

        // 判断是否相等
        System.out.println("clazz1==clazz2 = " + (clazz1 == clazz2));
        System.out.println("clazz2==clazz3 = " + (clazz2 == clazz3));
    }

}
