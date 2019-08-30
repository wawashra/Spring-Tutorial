package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class,editor);
	}
	@RequestMapping("/showForm")
	public String showFourm(Model model) {
		// create customer object 		
		// add customer object to the model 
		model.addAttribute("customer", new Customer());
	    // add the country options to the model 
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theStudent,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			System.out.println("sssss");
			return "customer-form";
		}
		return "customer-confirmation";
	}
}
