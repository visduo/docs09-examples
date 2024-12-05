package cn.duozai;

import java.lang.reflect.Field;

/**
 * 测试类
 *
 * @author 多仔ヾ
 */
public class TestMain {

    public static void main(String[] args) throws Exception {
        // 获取Person用户类的Class实例
        Class clz = Class.forName("cn.duozai.entity.Person");

        // 使用Class实例的newInstance方法实例化Person对象
        Object person = clz.newInstance();

        // 获取Person对象的name属性
        Field nameField = clz.getDeclaredField("name");
        // 设置name属性的访问权限为true
        nameField.setAccessible(true);

        // 获取Person对象的name属性
        System.out.println("修改前的name：" + nameField.get(person));

        // 修改Person对象的name属性的值
        nameField.set(person, "多仔");
        System.out.println("修改后的name：" + nameField.get(person));

        // 获取Person对象的age属性的值
        Field ageField = clz.getDeclaredField("age");
        ageField.setAccessible(true);
        // 静态属性可以通过get(null)获取，不需要传递具体的对象
        System.out.println("age：" + ageField.get(null));
    }

}
