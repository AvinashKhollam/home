package com.home.demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;

public class DemoController{

    @GetMapping
    public String getName(String str){
        return str;
    }
}