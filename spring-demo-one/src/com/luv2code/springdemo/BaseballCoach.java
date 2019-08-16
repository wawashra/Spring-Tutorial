package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDilyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDilyFortune() {
		// use my fortune service
		return this.fortuneService.getFortune();
	}
}
