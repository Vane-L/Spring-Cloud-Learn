package com.baidu.fsg.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(String.valueOf(getClass()));

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(HttpServletRequest request, HttpServletResponse response) {
        int status = response.getStatus();
        System.out.println("status: " + status);
        return "Hello World!";
    }
}
