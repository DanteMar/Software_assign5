package model.entities;

import model.dataccess.LoginDataAccess;

public class User {
	
	private String userName;
	private String password;
	
	private static User instance;

	private User()
	{
	}
	public static User getInstance() //singleton
	{
		if (instance == null)
		{
			instance = new User();
		}
		return instance;
	}
	
	public User (String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
