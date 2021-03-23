package com.cognizant.moviecruiser.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cognizant.moviecruiser.model.Favorites;

public interface FavouriteRepository extends JpaRepository<Favorites, Long> {

	@Query(value = "select m.id from favourites f join movies m on f.movie_id=m.id and f.user_id=:id",nativeQuery = true)
	public List<Integer> findByUserId(@Param("id")Long user_id);
	
}
