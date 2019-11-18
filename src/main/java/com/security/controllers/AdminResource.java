package com.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/admin")
public class AdminResource {

    @GetMapping("init")
    public String initAdmin(){
        return "Hello Admin";

    }
}
