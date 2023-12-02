package com.controller;

public class RegistrationData {

    private String fname;
    private String email;
    private String password;
    private String city;
    private String aboutMe;
    private String gender;

    public RegistrationData(String fname, String email, String password, String gender, String city, String aboutMe) {
        this.fname = fname;
        this.email = email;
        this.password = password;
        this.city = city;
        this.aboutMe = aboutMe;
        this.gender = gender;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
