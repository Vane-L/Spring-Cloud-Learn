package com.baidu.fsg.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonConsumer {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/testRibbon", method = RequestMethod.GET)
    public String test() {
        return restTemplate.getForEntity("http://hello-service:8801/hello", String.class).getBody();
    }
}
