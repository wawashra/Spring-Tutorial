package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	@NotNull
	@Size(min = 1 , message = "is requred")
	private String firstName;
	private String lastName;
	@NotNull(message = "is requred")
	@Min(value = 0,message = "must be >= 0 ")
	@Max(value = 155,message = "must be <= 155 ")
	private Integer age;
	public Customer() {
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

}
