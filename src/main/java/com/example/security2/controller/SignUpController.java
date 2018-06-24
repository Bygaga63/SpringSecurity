package com.example.security2.controller;

import com.example.security2.model.UserForm;
import com.example.security2.service.SignUpService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class SignUpController {

    private SignUpService signUpService;

    @GetMapping("/signUp")
    public String getSignUpPage(){
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(UserForm userForm){
        signUpService.signUp(userForm);
        return  "redirect:/login";
    }

}
