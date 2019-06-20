package com.example.feign.RestTemplateClient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Component
public class CallService {

    @Autowired
    @Qualifier("restTemplateInterceptor")
    private RestTemplate restTemplate;
    private final String URL = "http://localhost:8080/v1";


    public ResponseEntity callRestTemplate() {
        ResponseEntity response = restTemplate.postForObject(URL, "chamada com restTemplate", ResponseEntity.class);
        return response;

    }

}
