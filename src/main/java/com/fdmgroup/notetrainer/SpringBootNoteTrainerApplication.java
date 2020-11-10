package com.fdmgroup.notetrainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootNoteTrainerApplication extends SpringBootServletInitializer{

	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(SpringBootNoteTrainerApplication.class);
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootNoteTrainerApplication.class, args);
	}

	
}
