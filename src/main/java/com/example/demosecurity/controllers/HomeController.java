package com.example.demosecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/private")
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
