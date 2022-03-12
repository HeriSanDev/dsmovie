package com.herisandev.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herisandev.dsmovie.entities.Score;
import com.herisandev.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
}
