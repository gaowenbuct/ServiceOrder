package com.example.demo.order.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-logistic",fallback = LogisticServiceHystrix.class)
public interface LogisticService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiLogistic();
}
