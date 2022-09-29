package com.greatLearning.Library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatLearning.Library.Model.GreatLearning;

@SpringBootApplication
public class SpringBootLibraryDesignApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);
	System.out.println("Welcome all hii!!!!!!!!!");
	System.out.println("hello devTools.............");
	}

	@Override
	public void run(String... args) throws Exception {
		
		GreatLearning gl= new GreatLearning();
		
	    		
		
	}

}
