/*
 * Copyright (c)  zyfu0623.com 2022-2022. All rights reserved.
 */

package com.zyfu.accomplish_nothing.service;

import com.github.pagehelper.Page;
import com.zyfu.accomplish_nothing.domain.User;
import com.zyfu.accomplish_nothing.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: zyfu0623@163.com
 * Date: 2022/8/21 17:54
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    public Page<User> allUsers() {
        return userMapper.selectAll();
    }

    @Override
    public Integer registerUser(User user) {
        return userMapper.registerUser(user);
    }

    @Override
    public Integer unRegisterUser(User user) {
        return userMapper.unRegisterUser(user.getUsername());
    }
}
