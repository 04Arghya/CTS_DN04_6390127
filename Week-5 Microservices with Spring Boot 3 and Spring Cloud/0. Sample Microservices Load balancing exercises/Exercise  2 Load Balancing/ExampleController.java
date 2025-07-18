package com.cognizant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {
    @GetMapping("/hello")
    public String hello() {
        return "Response from port: " + System.getenv("LOCAL_SERVER_PORT");
    }
}