package com.example.springbootdemo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aaronqin on 17/3/22.
 */
@RestController
@EnableAutoConfiguration
public class HelloWorldController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Hello World!";
    }
}
