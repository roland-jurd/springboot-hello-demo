package com.demo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/hello")
public class HelloController {
    
    
    @GetMapping("/test")
    public String test() throws UnknownHostException {
        return "Hi Canary from " + InetAddress.getLocalHost().getHostName();
    }
    
}
