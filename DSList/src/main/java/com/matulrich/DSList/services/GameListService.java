package com.matulrich.DSList.services;

import com.matulrich.DSList.dto.GameDTO;
import com.matulrich.DSList.dto.GameListDTO;
import com.matulrich.DSList.dto.GameMinDTO;
import com.matulrich.DSList.entities.Game;
import com.matulrich.DSList.entities.GameList;
import com.matulrich.DSList.repositories.GameListRepository;
import com.matulrich.DSList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();


    }
}
