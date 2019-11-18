package com.security.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/init")
public class InitResource {

    @GetMapping
    public String init(){

        return "Hello World Securuty";

    }
}
