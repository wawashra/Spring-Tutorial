package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidattorConstraint implements ConstraintValidator<CourseCode, String> {
	private String coursePrefixes;
	@Override
	public void initialize(CourseCode constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
		coursePrefixes = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		if(theCode == null) {
			
			return true;
		}else {
			return theCode.toUpperCase().startsWith(coursePrefixes.toUpperCase());
		}
	}

}
