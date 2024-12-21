package com.falconaction.actions_test;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){

        return "hello team tem";
    }

    @RequestMapping("/yaar")
    public String yaar(){

        return "yaar";
    }
}
