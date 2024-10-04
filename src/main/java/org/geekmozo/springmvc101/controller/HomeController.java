package org.geekmozo.springmvc101.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("This is home url");
        return "index";
    }

    @RequestMapping("/")
    public String index() {
        System.out.println("This is home url");
        return "index";
    }

    @RequestMapping("/register")
    public String registerForm() {
        System.out.println("Calling register page");
        return "register";
    }
}
