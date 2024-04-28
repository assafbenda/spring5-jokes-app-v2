package com.assafbd.spring5jokesappv2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import services.ChuckNorrisService;
import services.ChuckNorrisServiceImpl;


@SpringBootApplication
public class Spring5JokesAppV2Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring5JokesAppV2Application.class, args);
		ChuckNorrisService chuckNorrisService = new ChuckNorrisServiceImpl();
		System.out.println(chuckNorrisService.getJoke());

	}

}
