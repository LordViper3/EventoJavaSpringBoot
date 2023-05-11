package com.matulrich.DSList.controllers;

import com.matulrich.DSList.dto.GameDTO;
import com.matulrich.DSList.dto.GameListDTO;
import com.matulrich.DSList.dto.GameMinDTO;
import com.matulrich.DSList.entities.Game;
import com.matulrich.DSList.entities.GameList;
import com.matulrich.DSList.services.GameListService;
import com.matulrich.DSList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;
    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }
}
