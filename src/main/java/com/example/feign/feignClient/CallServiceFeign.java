package com.example.feign.feignClient;


import com.example.feign.config.FeignClientInterceptor;
import feign.HeaderMap;
import feign.Headers;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "service", url="http://localhost:8080/v1", configuration = FeignClientInterceptor.class)
public interface CallServiceFeign {

    @PostMapping
    ResponseEntity callService(@RequestHeader(value = "token") String token, String body);


}
