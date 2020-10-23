package com.baidu.fsg.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "hello-service")
public interface HelloClient {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello();
}
