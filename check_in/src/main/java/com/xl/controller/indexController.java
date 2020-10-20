package com.xl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    @GetMapping("/index")
    public String toIndex(){
        return "check_in/login";
    }
}
