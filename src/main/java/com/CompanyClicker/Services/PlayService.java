package com.CompanyClicker.Services;

import com.CompanyClicker.Repositories.PlayRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayService {
    @Autowired
    private PlayRepo playRepo;


}
