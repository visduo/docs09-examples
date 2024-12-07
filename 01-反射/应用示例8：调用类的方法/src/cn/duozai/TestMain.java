package cn.duozai;

import java.lang.reflect.Method;

/**
 * 测试类
 */
public class TestMain {

    public static void main(String[] args) throws Exception {
        // 获取Person用户类的Class实例
        Class clz = Class.forName("cn.duozai.entity.Person");

        // 使用Class实例的newInstance方法实例化Person对象
        Object person = clz.newInstance();

        // 获取Person对象的silentMethod方法
        Method method = clz.getDeclaredMethod("silentMethod");
        // 设置silentMethod方法为可访问
        method.setAccessible(true);
        // 调用Person对象的silentMethod方法
        method.invoke(person);
    }

}
