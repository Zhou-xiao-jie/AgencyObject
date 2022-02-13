package com.atxiaojie.agencyobject.test;

import com.atxiaojie.agencyobject.service.impl.UserServiceImpl;
import com.atxiaojie.agencyobject.service.impl.UserServiceProxy;

/**
 * @ClassName: Test
 * @Description: 静态代理
 * @author: zhouxiaojie
 * @date: 2021/11/3 19:20
 * @Version: V1.0.0
 */
public class Test {

    public static void main(String[] args) {
        UserServiceImpl userImpl = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy(userImpl);
        proxy.addUser();
        System.out.println("----------分割线----------");
        proxy.editUser();
    }
}
