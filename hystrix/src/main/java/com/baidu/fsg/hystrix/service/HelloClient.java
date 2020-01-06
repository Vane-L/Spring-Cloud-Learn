package com.baidu.fsg.hystrix.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.baidu.fsg.hystrix.service.impl.HelloClientHystrix;

@FeignClient(value = "hello-service", fallback = HelloClientHystrix.class)
public interface HelloClient {
    @RequestMapping(method = RequestMethod.GET, value = "/getHello")
    public String getHello();
}
