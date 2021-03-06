package com.mobileapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import com.mobileapp.security.AppProperties;



@SpringBootApplication
public class MobileAppWsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MobileAppWsApplication.class, args);
	}

	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SpringApplicationContex springApplicationContext() {
		return new SpringApplicationContex();
	}
	@Bean(name="AppProperties")
	public AppProperties getAppProperties()
	{
		return new AppProperties();
	}
	
	
} 
