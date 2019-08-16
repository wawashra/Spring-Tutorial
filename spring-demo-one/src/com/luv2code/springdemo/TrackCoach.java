package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDilyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDilyFortune() {
		// TODO Auto-generated method stub
		return "Just do it " + fortuneService.getFortune();
	}

}
