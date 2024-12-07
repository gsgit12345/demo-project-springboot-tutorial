package com.demo.devtool.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String helloMsg(Model model) {
        String msg = "Welcome to Everyone!";
        model.addAttribute("message", msg);
        return "hello";
    }
}
