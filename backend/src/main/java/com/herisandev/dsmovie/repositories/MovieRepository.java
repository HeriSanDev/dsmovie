package com.herisandev.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herisandev.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}
