package com.gameslyst.dslist.repositories;

import com.gameslyst.dslist.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepository extends JpaRepository<Games, Long> {

}
