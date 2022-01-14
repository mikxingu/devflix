package com.mikxingu.devflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mikxingu.devflix.entities.Score;
import com.mikxingu.devflix.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
