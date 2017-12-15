package com.example.demo.order.controller;

import com.example.demo.order.service.LogisticService;
import com.example.demo.order.service.OrderService;
import com.example.demo.order.service.SystemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {
    @Resource
    OrderService orderService;
    @Resource
    LogisticService logisticService;
    @Resource
    SystemService systemService;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(){
        return orderService.sayHi();
    }
    @RequestMapping(value = "/hi-all",method = RequestMethod.GET)
    public String sayHiLogistic(){
        return logisticService.sayHiLogistic()+"\n"+systemService.sayHiSystem();
    }
}
