package cn.duozai;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 中介公司处理类
 */
public class AgentProxyHandler implements InvocationHandler {

    // 中介公司要帮某一个对象（具体对象不知道是谁）租房子
    // 即被代理的目标对象
    private Object target;
    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 中介公司生成代理
     *
     * @param proxy 动态生成的代理对象本身
     * @param method 要代理的方法（即代理租房子）
     * @param args 租房子方法的参数
     * @return 方法返回值对象
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("中介开始代理租房");

        // 目标对象租房
        // 通过反射让目标对象执行租房方法
        Object result = method.invoke(target, args);

        System.out.println("中介提供后期服务");

        return result;
    }

}
