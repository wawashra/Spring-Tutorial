package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create list
	private List<String> fortuneSet;
	private Random myRandom = new Random();
	
	@Value("${foo.filename}")
	private String fileName;
	
	@PostConstruct
	private void onCreate() {
		File theFile = new File("file\\" +fileName);	
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		// initialize array list
		fortuneSet = new ArrayList<String>();
		
		// read fortunes from file
		try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				fortuneSet.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortuneSet.size());
		return fortuneSet.get(index);
	}

}
