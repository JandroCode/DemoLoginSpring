package com.example.demosecurity.controllers;

import com.example.demosecurity.model.entity.Usuario;
import com.example.demosecurity.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public")
public class RegisterController {

    @Autowired
    private UserService userService;


    @GetMapping("/register-form")
    public String registerForm(Model model){
        model.addAttribute("usuario", new Usuario());
        return "registerForm";
    }

    @PostMapping("/register")
    public String userRegister(Usuario usuario){
        userService.saveUser(usuario);
        return "redirect:/public/login";
    }


}
