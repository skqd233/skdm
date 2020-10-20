package com.xl.controller;

import com.xl.entity.student;
import com.xl.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class studentController {

    @Autowired
    private studentService studentService;

    //注册
    @PostMapping("/register")
    public String register(student student){
        studentService.register(student);
        return "redirect:/index";//跳转到登录界面
    }
    //登录
    @PostMapping("/login")
    public String login(String wxs_name){
        student login = studentService.login(wxs_name);
        if(login!=null){
            //跳转页面
            return "redirect:/index";
        }else{
            return "redirect:/index";
        }
    }

}
