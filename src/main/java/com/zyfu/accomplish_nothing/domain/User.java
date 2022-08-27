/*
 * Copyright (c)  zyfu0623.com 2022-2022. All rights reserved.
 */

package com.zyfu.accomplish_nothing.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Author: zyfu0623@163.com
 * Date: 2022/8/21 16:25
 */
@Getter
@Setter
public class User {

    private Integer id;

    private String username;

    private String passwd;

    private String nickname;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Integer roleId;

    private Integer deleteFlag;

}
