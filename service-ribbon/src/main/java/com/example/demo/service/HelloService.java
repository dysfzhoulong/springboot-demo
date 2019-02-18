package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    
    @HystrixCommand(fallbackMethod="helloError")
    public String helloService(String name) {
        return restTemplate.getForObject("http://eureka-client/hello", String.class);
    }
    
    public String helloError(String name) {
    	return name+",error happens in Ribbon!";
    }
}

