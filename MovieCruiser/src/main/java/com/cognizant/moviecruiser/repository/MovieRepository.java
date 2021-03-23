package com.cognizant.moviecruiser.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.moviecruiser.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

	@Query(value = "select * from movies m where active=true and dol<curdate()",nativeQuery = true)
	public List<Movie> findCustomerMovie();
	
}
