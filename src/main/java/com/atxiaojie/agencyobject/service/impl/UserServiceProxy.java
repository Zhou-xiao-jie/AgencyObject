package com.atxiaojie.agencyobject.service.impl;

import com.atxiaojie.agencyobject.service.UserService;

/**
 * @ClassName: UserServiceProxy
 * @Description: 静态代理
 * @author: zhouxiaojie
 * @date: 2021/11/3 19:16
 * @copyright: 杭州鸿泉物联网技术股份有限公司
 * @Version: V1.0.0
 */
public class UserServiceProxy implements UserService {

    private UserServiceImpl userImpl;

    public UserServiceProxy(UserServiceImpl countImpl) {
        this.userImpl = countImpl;
    }

    public void addUser() {
        System.out.println("代理类方法，进行了增强。。。");
        System.out.println("事务开始。。。");
        // 调用委托类的方法;
        userImpl.addUser();
        System.out.println("处理结束。。。");
    }

    public void editUser() {
        System.out.println("代理类方法，进行了增强。。。");
        System.out.println("事务开始。。。");
        // 调用委托类的方法;
        userImpl.editUser();
        System.out.println("事务结束。。。");
    }
}
