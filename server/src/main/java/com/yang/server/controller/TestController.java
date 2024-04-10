package com.yang.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test2")
    public String getTest(){
        return "test is ok";
    }
}
