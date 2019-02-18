package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HelloService;
@RestController
public class HelloController {
 	@Autowired
    HelloService helloService;
 
    @RequestMapping("/hello")
    public String hello(String name) {
        return helloService.helloService(name);
    }
}
