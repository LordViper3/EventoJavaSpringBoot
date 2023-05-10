package com.matulrich.DSList.repositories;

import com.matulrich.DSList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {


}
