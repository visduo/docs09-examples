package cn.duozai;

import java.lang.reflect.Proxy;

/**
 * 测试类
 */
public class TestMain {

    public static void main(String[] args) {
        // 张三要租房，创建张三对象
        User zhangsan = new User();

        // 创建中介公司
        AgentProxyHandler agentProxyHandler = new AgentProxyHandler();
        // 告诉中介公司张三要租房
        agentProxyHandler.setTarget(zhangsan);


        // 让中介公司创建中介对象为张三服务
        // 参数1：当前目标对象的类加载器（张三）
        // 参数2：目标对象实现的接口（租房服务）
        // 参数3：动态代理类，用来处理代理逻辑（中介公司）
        RentService lisi = (RentService) Proxy.newProxyInstance(User.class.getClassLoader(), User.class.getInterfaces(), agentProxyHandler);

        // 中介帮忙租房
        lisi.rent();
    }

}
