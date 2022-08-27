/*
 * Copyright (c)  zyfu0623.com 2022-2022. All rights reserved.
 */

package com.zyfu.accomplish_nothing;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zyfu.accomplish_nothing.mapper")
public class AccomplishNothingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccomplishNothingApplication.class, args);
    }

}
