package com.example.feign.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateDefault {

    @Bean("default")
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
