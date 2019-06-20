package com.example.feign.feignClient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "token", url = "http://localhost:8080/v1/token")
public interface GetToken {

    @GetMapping
    String getToken();
}
