/*
 * Copyright (c)  zyfu0623.com 2022-2022. All rights reserved.
 */

package com.zyfu.accomplish_nothing.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * Author: zyfu0623@163.com
 * Date: 2022/8/25 21:12
 */
@Configuration
public class JsonConfig {
    @Bean
    FastJsonHttpMessageConverter fastJsonHttpMessageConverter() {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        FastJsonConfig config = new FastJsonConfig();

        ArrayList<MediaType> mediaTypes = new ArrayList<>();
        mediaTypes.add(MediaType.APPLICATION_JSON);
        mediaTypes.add(MediaType.APPLICATION_PROBLEM_JSON);
        mediaTypes.add(MediaType.MULTIPART_FORM_DATA);
        mediaTypes.add(MediaType.IMAGE_PNG);
        mediaTypes.add(MediaType.IMAGE_JPEG);
        mediaTypes.add(MediaType.IMAGE_GIF);
        mediaTypes.add(MediaType.MULTIPART_MIXED);
        converter.setSupportedMediaTypes(mediaTypes);
        config.setCharset(StandardCharsets.UTF_8);
        config.setDateFormat("yyyy-MM-dd HH:mm:ss");
        config.setSerializerFeatures(
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.PrettyFormat,
                SerializerFeature.WriteNullStringAsEmpty,
                SerializerFeature.WriteNullListAsEmpty,
                SerializerFeature.WriteNullNumberAsZero
        );
        converter.setFastJsonConfig(config);
        return converter;
    }
}
