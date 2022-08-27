/*
 * Copyright (c)  zyfu0623.com 2022-2022. All rights reserved.
 */

package com.zyfu.accomplish_nothing.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zyfu.accomplish_nothing.common.BaseResp;
import com.zyfu.accomplish_nothing.domain.User;
import com.zyfu.accomplish_nothing.pojo.dto.UserCondition;
import com.zyfu.accomplish_nothing.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.logging.Logger;

/**
 * Author: zyfu0623@163.com
 * Date: 2022/8/21 17:51
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("users")
    public PageInfo<User> allUsers (@RequestBody @Validated UserCondition condition) {
        PageHelper.startPage(condition.getPageNum(), condition.getPageSize());
        Page<User> users = userService.allUsers();
        return new PageInfo<>(users);
    }

    @PostMapping("registerUser")
    public BaseResp<Integer> registerUser(@RequestBody User user) {
        user.setCreateTime(new Date());
        try {

            Integer id = userService.registerUser(user);
        } catch (DuplicateKeyException exception) {
            Logger.getAnonymousLogger().info(exception.getMessage());
            return new BaseResp<>(500, null, "duplicate user name");
        }
        return new BaseResp<>(user.getId());
    }

    @PostMapping("unRegisterUser")
    public BaseResp<Integer> unRegisterUser(@RequestBody User user) {
        Integer count = userService.unRegisterUser(user);
        return new BaseResp<>(count);
    }

}
