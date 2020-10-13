package com.xl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xl.entity.manager;
import com.xl.service.managerService;
@Controller
@RequestMapping("/manager")
public class managerController {

    @Autowired
    private managerService managerService;


    //登录
    @PostMapping("/login")
    public String login(String account,String password){
        manager login = managerService.login(account, password);
        if(login!=null){
            return "redirect:/check_in/findAll";
        }else{
            return "redirect:/index";
        }
    }
}
