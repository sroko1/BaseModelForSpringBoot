package com.sroks.sampleapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/users")
    public String getUsers() {
        return "user";
    }
}
