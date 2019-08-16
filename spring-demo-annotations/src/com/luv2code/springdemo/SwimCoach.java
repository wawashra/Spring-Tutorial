package com.luv2code.springdemo;
public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public SwimCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as warm up .";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
