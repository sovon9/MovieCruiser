package com.cognizant.moviecruiser.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.service.MovieService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MovieController {

	@Autowired
	public MovieService movieService;
	
	@RequestMapping(value = "/movie",method = RequestMethod.GET)
	public String getMovieListAdmin(ModelMap map)
	{
		log.info("working");
		List<Movie> movieListAdmin = movieService.getMovieListAdmin();
		log.info(" "+movieListAdmin);
		map.addAttribute("movieList",movieListAdmin);
		return "movie-admin-list";
		
	}
	
	@RequestMapping(value = "/edit-movie",method = RequestMethod.GET)
	public String editMovieListAdmin(@RequestParam String title,@ModelAttribute("movie") Movie movie,ModelMap map)
	{
		log.info("edit");
		//log.info(title);
		List<Movie> movieListAdmin = movieService.getMovieListAdmin();
		movie=movieListAdmin.stream().filter(m->m.getTitle().equals(title)).findAny().get();
		map.addAttribute("movie",movie);
		log.info(movie.getTitle());
		//Movie m=movieService.editMovieListAdmin(movie);
		//log.debug("movie data: ",m);
		return "edit-movie";
		
	}
	
	@RequestMapping(value = "/editstatus",method = RequestMethod.GET)
	public String statusMovieListAdmin(@ModelAttribute("movie") Movie movie,ModelMap map)
	{
		log.info("status");
		Movie m=movieService.editMovieListAdmin(movie);;
		log.debug("movie data: {} ",m);
		return "edit-movie-status";
		
	}
	
	@RequestMapping(value = "/movie-list-customer",method = RequestMethod.GET)
	public String getMovieListCustomer(ModelMap map)
	{
		log.info("customer list");
		List<Movie> movieListCustomer = movieService.findCustomerMovie();
		map.addAttribute("movieList",movieListCustomer);
		return "movie-list-customer";
		
	}
	
	
//	@RequestMapping(value = "/movie-list-customer",method = RequestMethod.GET)
//	public String getFavouriteList(ModelMap map)
//	{
//		log.info("favourite list");
//		
//		map.addAttribute("movieList",movieListCustomer);
//		return "movie-list-customer";
//		
//	}
	
	@ModelAttribute(name = "genre")
	public List<String> genres()
	{
		return Arrays.asList("Romance","Superhero","Science Fiction");
	}
	
}
