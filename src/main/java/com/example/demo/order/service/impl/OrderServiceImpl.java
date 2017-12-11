package com.example.demo.order.service.impl;

import com.example.demo.order.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = "orderService")
public class OrderServiceImpl implements OrderService {
    private static final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);
    @Value("${server.port}")
    String port;
    @Override
    public String sayHi(String name) {
        log.info("sayHi called");
        return "Order:Hi "+name+",i am from port:" +port;
    }
}
