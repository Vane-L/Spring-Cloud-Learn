package com.baidu.fsg.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(String.valueOf(getClass()));

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        HttpServletResponse httpServletResponse = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        int status = httpServletResponse.getStatus();
        System.out.println(status);
        return "Hello World!";
    }
}
