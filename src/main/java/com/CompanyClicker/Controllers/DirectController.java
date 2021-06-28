package com.CompanyClicker.Controllers;

import com.CompanyClicker.Entities.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DirectController {

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @GetMapping("/registration")
    public String getRegistration(Model model) {
        model.addAttribute("player", new Player());
        return "registration";
    }
}
