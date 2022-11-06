package com.spring.learn.user;

import java.time.LocalDate;

public class User {
	
	private int userId;
	
	private String userName;
	
	private LocalDate birthDate;
	
	 

	public User() {
		super();
	}

	

	public User(int userId, String userName, LocalDate birthDate) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.birthDate = birthDate;
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", birthDate=" + birthDate + "]";
	}


	
	
	
	
	

}
