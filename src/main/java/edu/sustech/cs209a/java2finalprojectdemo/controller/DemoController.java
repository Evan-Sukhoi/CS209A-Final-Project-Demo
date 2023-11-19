package edu.sustech.cs209a.java2finalprojectdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping({"/", "/demoPage"})
    public String demoPage() {
        return "demoPage";
    }
}
