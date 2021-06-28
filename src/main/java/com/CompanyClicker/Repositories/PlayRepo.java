package com.CompanyClicker.Repositories;

import com.CompanyClicker.Entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayRepo extends JpaRepository<Player, Long> {

}
