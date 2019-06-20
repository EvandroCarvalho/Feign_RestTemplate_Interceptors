package com.example.feign.config;

import com.example.feign.feignClient.GetToken;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class FeignClientInterceptor implements RequestInterceptor {

    @Autowired
    private GetToken token;

    @Override
    public void apply(RequestTemplate requestTemplate) {

        String token = this.token.getToken();

        requestTemplate.header("Autorization", token);
    }
}
