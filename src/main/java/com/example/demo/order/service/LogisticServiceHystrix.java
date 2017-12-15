package com.example.demo.order.service;

public class LogisticServiceHystrix implements LogisticService{

    @Override
    public String sayHiLogistic() {
        return "Sorry,logisticService is down!";
    }
}
