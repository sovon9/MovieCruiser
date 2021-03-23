package com.cognizant.moviecruiser.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepository;

	@Transactional
	public List<Movie> getMovieListAdmin() {
		return movieRepository.findAll();
	}

	@Transactional
	public Movie editMovieListAdmin(Movie movie) {
		return movieRepository.save(movie);
	}
	
	@Transactional
	public List<Movie> findCustomerMovie()
	{
		return movieRepository.findCustomerMovie();
	}

}