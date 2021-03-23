package com.cognizant.moviecruiser.MovieCruiser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.cognizant.moviecruiser")
@EnableJpaRepositories(basePackages = "com.cognizant.moviecruiser")
@EntityScan("com.cognizant.moviecruiser")
@SpringBootApplication
public class MovieCruiserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCruiserApplication.class, args);
	}
 
}
