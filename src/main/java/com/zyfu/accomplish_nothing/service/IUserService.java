/*
 * Copyright (c)  zyfu0623.com 2022-2022. All rights reserved.
 */

package com.zyfu.accomplish_nothing.service;

import com.github.pagehelper.Page;
import com.zyfu.accomplish_nothing.domain.User;

/**
 * Author: zyfu0623@163.com
 * Date: 2022/8/21 17:54
 */
public interface IUserService {

    Page<User> allUsers();

    Integer registerUser(User user);

    Integer unRegisterUser(User user);
}
