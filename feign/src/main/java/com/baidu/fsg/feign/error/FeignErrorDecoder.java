package com.baidu.fsg.feign.error;

import com.netflix.hystrix.exception.HystrixBadRequestException;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wenhongliang
 */
@Configuration
public class FeignErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        if (response.status() != 200) {
            throw new RuntimeException("Other System Error");
        }
        return decode(s, response);
    }
}
