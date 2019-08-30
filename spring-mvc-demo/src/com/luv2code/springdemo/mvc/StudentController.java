package com.luv2code.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	@Value("#{favoriteLanguageOptions}") 
	private Map<String, String> favoriteLanguageOptions;
	@Value("#{favoriteOsOptions}") 
	private Map<String, String> favoriteOsOptions;

	@RequestMapping("/showForm")
	public String showFourm(Model model) {
		// create student object 
		Student theStudent = new Student();
		
		// add student object to the model 
		model.addAttribute("student", theStudent);
	    // add the country options to the model 
	    model.addAttribute("theCountryOptions", countryOptions); 
	    // add the favorite Language options to the model 
	    model.addAttribute("favoriteLanguageOptions", favoriteLanguageOptions); 
	    // add the favorite Os options to the model 
	    model.addAttribute("favoriteOsOptions", favoriteOsOptions); 

		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		return "student-confirmation";
	}
}
