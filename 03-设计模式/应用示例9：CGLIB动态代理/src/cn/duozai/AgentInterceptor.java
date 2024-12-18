package cn.duozai;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 中介公司规则类
 */
public class AgentInterceptor implements MethodInterceptor {

    /**
     * 中介代理规则
     *
     * @param o 被代理的目标对象实例（要租房子的人）
     * @param method 被拦截的方法
     * @param objects 传递给方法的参数
     * @param methodProxy 父类中的原始方法
     * @return 方法返回值对象
     * @author 多仔ヾ
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("中介开始代理租房");

        // 目标对象租房
        // 通过反射让父类执行租房方法
        Object result = methodProxy.invokeSuper(o, objects);

        System.out.println("中介提供后期服务");

        return result;
    }

}
