package com.movieinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieInfoApplication {

	public static void main(String[] args) {

		SpringApplication.run(MovieInfoApplication.class, args);
		System.out.println("movie-info");
	}

}
