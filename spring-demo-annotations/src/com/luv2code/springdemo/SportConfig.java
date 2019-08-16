package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {
	@Bean
	public FortuneService randomFortuneService() {
		return new RandomFortuneService();
	}
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(randomFortuneService());
	}
}
