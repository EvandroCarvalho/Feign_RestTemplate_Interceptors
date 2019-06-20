package com.example.feign.service;

public class ServiceForCallAPI<T> {

    private T t;


    public ServiceForCallAPI(T model) {
        this.t = model;
    }


    public void callService() {

    }

}
