/*
 * Copyright (c)  zyfu0623.com 2022-2022. All rights reserved.
 */

package com.zyfu.accomplish_nothing.mapper;

import com.github.pagehelper.Page;
import com.zyfu.accomplish_nothing.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Author: zyfu0623@163.com
 * Date: 2022/8/21 17:48
 */
@Repository
public interface UserMapper {

    Page<User> selectAll();

    Integer registerUser(User user);

    Integer unRegisterUser(String username);
}
