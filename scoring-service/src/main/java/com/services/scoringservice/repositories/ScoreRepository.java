package com.services.scoringservice.repositories;

import com.services.scoringservice.entities.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {

}
