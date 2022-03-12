package com.herisandev.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.herisandev.dsmovie.dto.MovieDto;
import com.herisandev.dsmovie.entities.Movie;
import com.herisandev.dsmovie.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repository;
	
	@Transactional(readOnly = true)
	public Page<MovieDto> findAll(Pageable pageable){
		Page<Movie> result = repository.findAll(pageable);
		Page<MovieDto> page= result.map(x -> new MovieDto(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public MovieDto findById(Long id){
		Movie result = repository.findById(id).get();
		MovieDto dto= new MovieDto(result);
		return dto;
	}
}
