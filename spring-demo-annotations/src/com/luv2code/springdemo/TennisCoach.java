package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	public TennisCoach() {
		System.out.println(" >> Inside Constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return this.fortuneService.getFortune();
	}
	

}
