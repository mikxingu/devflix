package com.mikxingu.devflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mikxingu.devflix.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
