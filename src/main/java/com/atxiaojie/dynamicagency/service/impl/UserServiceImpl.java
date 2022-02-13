package com.atxiaojie.dynamicagency.service.impl;

import com.atxiaojie.dynamicagency.service.UserService;

/**
 * @ClassName: UserServiceImpl
 * @Description: 动态代理
 * @author: zhouxiaojie
 * @date: 2021/11/3 19:23
 * @Version: V1.0.0
 */
public class UserServiceImpl implements UserService {
    public void addUser() {
        System.out.println("动态代理增加一个用户。。。");
    }

    public void editUser(String name) {
        System.out.println(name+"动态代理编辑一个用户。。。");
    }
}
