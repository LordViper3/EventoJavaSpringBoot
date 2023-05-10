package com.matulrich.DSList.repositories;

import com.matulrich.DSList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {


}
