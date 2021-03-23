package com.cognizant.moviecruiser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.moviecruiser.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value = "select * from user where id=1",nativeQuery = true)
	public User findByUserId();
}
