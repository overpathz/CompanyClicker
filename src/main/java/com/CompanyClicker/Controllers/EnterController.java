package com.CompanyClicker.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class EnterController {

    @GetMapping("/")
    public String getEnter(Principal principal) {
        if (principal != null) {
            return "redirect:/main";
        }

        return "index";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @GetMapping("/registration")
    public String getRegistration() {
        return "registration";
    }
}
