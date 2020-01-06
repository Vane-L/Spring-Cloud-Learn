package com.baidu.fsg.hystrix.service.impl;

import org.springframework.stereotype.Service;

import com.baidu.fsg.hystrix.service.HelloClient;

@Service
public class HelloClientHystrix implements HelloClient {
    @Override
    public String getHello() {
        return  "Hello getHello()服务不可用.";
    }
}
