package cn.duozai;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * 测试类
 */
public class TestMain {

    public static void main(String[] args) throws ClassNotFoundException {
        // 获取Person用户类的Class实例
        Class clz = Class.forName("cn.duozai.entity.Person");

        // 获取类的全名
        System.out.println("类的名称：" + clz.getName());

        // 获取类的简称
        System.out.println("类的简称：" + clz.getSimpleName());

        // 获取类所在的包
        Package pkg = clz.getPackage();
        System.out.println("类所在的包：" + pkg.getName());

        // 获取父类
        Class superClz = clz.getSuperclass();
        System.out.println("父类的名称：" + superClz.getName());

        // 获取类实现的所有接口
        Class[] interfaces = clz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("类实现的接口：" + anInterface.getName());
        }

        // 获取类的修饰符
        System.out.println("类的修饰符（解码前）：" + clz.getModifiers());
        System.out.println("类的修饰符（解码后）：" + Modifier.toString(clz.getModifiers()));

        // 获取类的所有的构造函数
        Constructor[] allConstructors = clz.getDeclaredConstructors();
        // 遍历所有的构造函数
        for (Constructor aConstructor : allConstructors) {
            System.out.println("类的构造函数：");
            System.out.println("构造函数的名称：" + aConstructor.getName());
            System.out.println("构造函数的参数：" + Arrays.toString(aConstructor.getParameterTypes()));
            System.out.println("构造函数的修饰符：" + Modifier.toString(aConstructor.getModifiers()));
        }

        // 获取类的所有的属性
        Field[] allFields = clz.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println("类的属性：");
            System.out.println("属性的名称：" + field.getName());
            System.out.println("属性的类型：" + field.getType().getName());
            System.out.println("属性的修饰符：" + Modifier.toString(field.getModifiers()));
        }
    }

}
