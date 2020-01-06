package com.baidu.fsg.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.fsg.feign.service.HelloClient;

@RestController
public class HelloController {
    @Autowired
    private HelloClient helloClient;

    @RequestMapping(value = "/feign", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return helloClient.hello();
    }
}
