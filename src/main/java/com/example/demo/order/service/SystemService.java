package com.example.demo.order.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-system",fallback = SystemServiceHystrix.class)
public interface SystemService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiSystem();
}
