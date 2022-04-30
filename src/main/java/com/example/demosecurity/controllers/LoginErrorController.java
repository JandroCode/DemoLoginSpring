package com.example.demosecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public/error")
public class LoginErrorController {

    @GetMapping("")
    public String loginError(){
        return "loginError";
    }
}
