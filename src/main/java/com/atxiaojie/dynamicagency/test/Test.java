package com.atxiaojie.dynamicagency.test;

import com.atxiaojie.dynamicagency.ServiceInvocationHandler;
import com.atxiaojie.dynamicagency.service.UserService;
import com.atxiaojie.dynamicagency.service.impl.UserServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @ClassName: Test
 * @Description: jdk动态代理
 * @author: zhouxiaojie
 * @date: 2021/11/3 19:52
 * @Version: V1.0.0
 */
public class Test {
    /**
     * jdk动态代理会生成一个动态代理类，生成相应的字节码，然后通过ClassLoader加载字节码。
     * 该实例继承了Proxy类，并实现了业务接口，在实现的方法里通过反射调用了InvocationHandler接口实现类
     * 的invoke()回调方法。
     * @param args
     * @throws Throwable
     */
    public static void main(String[] args) throws Throwable {
        UserService userService = new UserServiceImpl();
        ServiceInvocationHandler handler = new ServiceInvocationHandler(userService);
        UserService proxy = (UserService)Proxy.newProxyInstance(UserService.class.getClassLoader(),
                userService.getClass().getInterfaces(), handler);
        proxy.editUser("Hello");
    }
}
