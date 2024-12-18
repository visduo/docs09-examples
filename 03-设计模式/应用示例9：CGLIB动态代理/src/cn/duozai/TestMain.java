package cn.duozai;

import net.sf.cglib.proxy.Enhancer;

/**
 * 测试类
 */
public class TestMain {

    public static void main(String[] args) {
        // 动态创建代理类及其实例
        Enhancer enhancer = new Enhancer();
        // 设置中介代理的父类
        enhancer.setSuperclass(User.class);
        // 设置中介代理的生成规则
        enhancer.setCallback(new AgentInterceptor());

        // 创建中介代理
        User user = (User) enhancer.create();
        user.rent();
    }

}
