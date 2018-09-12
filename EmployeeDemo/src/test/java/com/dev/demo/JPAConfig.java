package com.dev.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration 
@EnableJpaRepositories({"com.dev.dao","com.dev.service","com.dev.controller"})
public class JPAConfig  
{

}
