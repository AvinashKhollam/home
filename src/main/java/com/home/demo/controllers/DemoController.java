package com.home.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController{

    @GetMapping("name")
    public String getName(@RequestParam String str){
        return "hi "+str;
    }
}