package com.example.awsbeanstalkpipelineexample;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloWorldController {

    @GetMapping
    public String hello() {
        return "Hello TechPrimers";
    }

    @GetMapping("/ping")
    public String pint(){

        return "PONG";
    }
}