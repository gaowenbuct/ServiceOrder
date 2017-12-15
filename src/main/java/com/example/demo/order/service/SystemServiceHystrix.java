package com.example.demo.order.service;

public class SystemServiceHystrix implements SystemService{
    @Override
    public String sayHiSystem() {
        return "Sorry,systemService is down!";
    }
}
