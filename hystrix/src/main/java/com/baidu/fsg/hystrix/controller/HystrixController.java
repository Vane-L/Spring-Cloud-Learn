package com.baidu.fsg.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.fsg.hystrix.service.HelloClient;

@RestController
public class HystrixController {
    @Qualifier("helloClientHystrix")
    @Autowired
    private HelloClient helloClient;

    @RequestMapping(value = "/getHello", method = RequestMethod.GET)
    public String getHello() {
        return helloClient.getHello();
    }
}
