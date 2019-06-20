package com.example.feign.controller;

import com.example.feign.RestTemplateClient.CallService;
import com.example.feign.feignClient.CallServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1")
public class Controller {

    @Autowired
    private CallServiceFeign serviceFeign;

    @Autowired
    private CallService serviceRestTemplate;

    @PostMapping
    public ResponseEntity testController(@RequestBody String request, @RequestHeader HttpHeaders headers) {
        System.out.println(headers);
        System.out.println(request);
        return ResponseEntity.ok().build();

    }

    @GetMapping(path = "/feign")
    public ResponseEntity getTestController() {
        return serviceFeign.callService("token213","test");
    }

    @GetMapping(path = "/restTemplate")
    public ResponseEntity getRestTemplate() {
        return serviceRestTemplate.callRestTemplate();
    }


    @GetMapping(path = "/token")
    public String getToken() {
        return "token12345";
    }
}
