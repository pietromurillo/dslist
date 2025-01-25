package com.gameslyst.dslist.controllers;

import com.gameslyst.dslist.dto.GamesMinDTO;
import com.gameslyst.dslist.entities.Games;
import com.gameslyst.dslist.services.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GamesController {

    @Autowired
    private GamesService gamesService;

    @GetMapping
    public List<GamesMinDTO> findAll(){
        List<GamesMinDTO> result = gamesService.findAll();
        return result;
    }
}
