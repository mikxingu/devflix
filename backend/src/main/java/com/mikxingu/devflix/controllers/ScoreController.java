package com.mikxingu.devflix.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mikxingu.devflix.dto.MovieDTO;
import com.mikxingu.devflix.dto.ScoreDTO;
import com.mikxingu.devflix.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService scoreService;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
		MovieDTO movieDTO = scoreService.saveScore(dto);
		
		return movieDTO;
	}
	

}
