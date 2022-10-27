package com.springboot.first.app;

public class Student {
	private String slackUsername;
	private boolean backend;
	private int age;
	private String bio;
	
	

	public Student(String slackUsername, boolean backend, int age, String bio) {
		super();
		this.slackUsername = slackUsername;
		this.backend = backend;
		this.age = age;
		this.bio = bio;
	}
	public String getSlackUsername() {
		return slackUsername;
	}
	public void setSlackUsername(String slackUsername) {
		this.slackUsername = slackUsername;
	}
	public boolean isBackend() {
		return backend;
	}
	public void setBackend(boolean backend) {
		this.backend = backend;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	 
}
