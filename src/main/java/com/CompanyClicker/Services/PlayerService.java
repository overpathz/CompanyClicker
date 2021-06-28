package com.CompanyClicker.Services;

import com.CompanyClicker.Entities.Player;
import com.CompanyClicker.Repositories.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepo playRepo;

    public void save(Player player) {
        playRepo.save(player);
    }
}
