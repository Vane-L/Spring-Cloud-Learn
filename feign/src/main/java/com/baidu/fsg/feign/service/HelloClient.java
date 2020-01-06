package com.baidu.fsg.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("hello-service")
public interface HelloClient {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String hello();
}
