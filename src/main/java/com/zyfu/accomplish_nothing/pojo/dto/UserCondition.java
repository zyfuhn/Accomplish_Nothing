/*
 * Copyright (c)  zyfu0623.com 2022-2022. All rights reserved.
 */

package com.zyfu.accomplish_nothing.pojo.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

/**
 * Author: zyfu0623@163.com
 * Date: 2022/8/25 22:15
 */

@Getter
@Setter
public class UserCondition {

    @NonNull
    private Integer pageNum;

    @NonNull
    private Integer pageSize;

    private Integer userStatus;

    private String orderByCol;

    private String nickname;

    private String username;

}
