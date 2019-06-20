package com.example.feign.config;


import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;

@Configuration
public class FeignInterceptor {

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header("user", "userName");
            requestTemplate.header("password", "password");
            requestTemplate.header("Content-type", MediaType.APPLICATION_JSON_UTF8.toString());
        };
    }
}
