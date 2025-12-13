package com.shivam.lovable_ai.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public void handleLogin() {}

    @PostMapping("/signUp")
    public void handleSignUp() {}

    @GetMapping("/me")
    public void handleFetchProfile() {}
}
