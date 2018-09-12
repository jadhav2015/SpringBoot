package com.dev;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//@ComponentScan({"com.dev.controller","com.dev.dao","com.dev.demo"})
@EnableAutoConfiguration
@SpringBootApplication 
public class DemoApplication 
{

	
	public static void main(String[] args) 
	{
		
		SpringApplication.run(DemoApplication.class, args);
	}

	
}
