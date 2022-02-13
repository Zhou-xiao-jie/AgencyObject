package com.atxiaojie.cglib.test;

import com.atxiaojie.cglib.service.UserServiceCglib;
import com.atxiaojie.cglib.service.UserServiceImpl;

/**
 * @ClassName: TestCglib
 * @Description: cglib代理
 * @author: zhouxiaojie
 * @date: 2021/11/4 20:14
 * @Version: V1.0.0
 */
public class TestCglib {

    public static void main(String[] args) {
        UserServiceCglib cglib = new UserServiceCglib();
        UserServiceImpl instance = (UserServiceImpl) cglib.getInstance(new UserServiceImpl());
        instance.addUser();
    }
}
