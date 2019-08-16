package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String emailAddress;
	private String teamName;
	
	public CricketCoach() {
		System.out.println("CricketCoach inside non-arg cons. ");
	}
	
	@Override
	public String getDilyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 min";
	}

	@Override
	public String getDilyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside method setFortuneService");
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("inside method setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeamName(String teamName) {
		System.out.println("inside method setTeamName");

		this.teamName = teamName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}
	
	public void onInit() {
		System.out.println("Start bean -> onInit runing");
	}
	
	public void onDestroy() {
		System.out.println("stop bean -> onDestroy runing");
	}
	
	

}
