/*
 * Copyright (c)  zyfu0623.com 2022-2022. All rights reserved.
 */

package com.zyfu.accomplish_nothing.common;

import lombok.Getter;
import lombok.Setter;

/**
 * 响应基础类
 * Author: zyfu0623@163.com
 * Date: 2022/8/25 21:57
 */
@Getter
@Setter
public class BaseResp<T> {

    private Integer code;

    private T data;

    private String msg;

    public BaseResp(T data) {
        this.data = data;
        this.code = 200;
    }

    public BaseResp(Integer code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }
}
