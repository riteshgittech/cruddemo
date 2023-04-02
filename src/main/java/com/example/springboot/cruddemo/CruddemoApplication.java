package com.example.springboot.cruddemo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CruddemoApplication  implements ApplicationRunner{

	
	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
		System.out.println("Hi this is springboot2 dfds: " );
	}




	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hey this is appln runner");
	}




	/*@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("command line");
	}*/

	

}
