package com.gameslyst.dslist.services;


import com.gameslyst.dslist.dto.GamesMinDTO;
import com.gameslyst.dslist.entities.Games;
import com.gameslyst.dslist.repositories.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamesService {

    @Autowired
    private GamesRepository gamesRepository;

    public List<GamesMinDTO> findAll(){
        var result = gamesRepository.findAll();
        return result.stream().map(x -> new GamesMinDTO(x)).toList();
    }
}
