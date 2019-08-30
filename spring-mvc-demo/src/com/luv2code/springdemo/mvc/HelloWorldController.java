package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";	
	}
	
	// need a controller method to process the HTML form 
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormv2")
	public String letsShoutDude(@RequestParam("name") String theName, Model model) {
				
		// convert name to upper case 
		theName = theName.toUpperCase();
		
		// create the message 
		String MSG = "Yo ! " + theName;
		
		// put the MSG to Model 
		model.addAttribute("message", MSG);
		
		// return hello world page
		return "helloworld";
	}

}
