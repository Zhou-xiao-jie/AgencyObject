package com.atxiaojie.cglib.service;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName: UserServiceCglib
 * @Description: TODO
 * @author: zhouxiaojie
 * @date: 2021/11/4 20:07
 * @Version: V1.0.0
 */
public class UserServiceCglib implements MethodInterceptor {

    private Object target;

    /**
     * @MethodsName: getInstance
     * @Description 创建代理实例
     * @Author zhouxiaojie
     * @Date 20:14 2021/11/4
     * @Param [target]
     * @return java.lang.Object
     **/
    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        // 设置回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    /**
     * @MethodsName: intercept
     * @Description 实现MethodInterceptor接口要重写的方法。
     * @Author zhouxiaojie
     * @Date 20:14 2021/11/4
     * @Param [o, method, objects, methodProxy]
     * @return java.lang.Object
     **/
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("事务开始。。。");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("事务结束。。。");
        return result;
    }

}
