package com.controller;

public class RegistrationError {
	public String fname;
	public String email;
	public String password;
	public String gender;
	public String city;
	public String aboutMe;
	
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	
	public String getGender() {
		return gender;
	}

	public String getCity() {
		return city;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	
}
