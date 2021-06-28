package com.CompanyClicker.Controllers;

import com.CompanyClicker.Entities.Player;
import com.CompanyClicker.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class RegistrationController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("/register")
    public String registerPlayer(@ModelAttribute("player") Player player) {
        player.setPass(BCrypt.hashpw(player.getPass(), BCrypt.gensalt()));
        playerService.save(player);
        return null;
    }

}
