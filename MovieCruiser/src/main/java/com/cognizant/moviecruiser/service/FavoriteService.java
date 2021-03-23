package com.cognizant.moviecruiser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.moviecruiser.model.User;
import com.cognizant.moviecruiser.repository.FavouriteRepository;

@Service
public class FavoriteService {
	
	@Autowired
	public FavouriteRepository favouriteRepository;

//	public Favorite getUserFavourites()
//	{
//		 List<Integer> findByUserId = favouriteRepository.findByUserId(1L);
//		 
//	}
	
}
