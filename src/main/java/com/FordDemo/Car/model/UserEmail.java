package com.FordDemo.Car.model;

import org.springframework.stereotype.Component;

@Component
public class UserEmail {

	private String emailAddress;

	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}