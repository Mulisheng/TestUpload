package com.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
//    @RequestMapping({"/","/index.html","index"})
//    public String index()
//    {
//        return "index";
//    }

    @RequestMapping("/hello")
    public String hello()
    {
        System.out.println("进入hello");

        return "t1";
    }
}
