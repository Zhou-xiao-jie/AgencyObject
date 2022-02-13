package com.atxiaojie.dynamicagency;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: ServiceInvocationHandler
 * @Description: TODO
 * @author: zhouxiaojie
 * @date: 2021/11/3 19:25
 * @Version: V1.0.0
 */
public class ServiceInvocationHandler implements InvocationHandler {

    // 目标对象
    private Object target;

    public ServiceInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 实现InvocationHandler接口方法
     * 执行目标对象的方法，并进行增强
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 增强逻辑
        System.out.println("PROXY : " + proxy.getClass().getName());

        // 反射调用，目标方法
        Object result = method.invoke(target, args);

        // 增强逻辑
        System.out.println(method.getName() + " : " + result);

        return result;
    }

}
