package model.business;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.dataccess.LoginDataAccess;
import model.entities.MessageException;
import model.entities.User;
import view.LoginSuccessView;

public class LoginBusiness {


private String username;
private String password;
private static LoginBusiness instance;

private LoginBusiness()
{
}
public static LoginBusiness getInstance() //singleton
{
	if (instance == null)
	{
		instance = new LoginBusiness();
	}
	return instance;
}
public boolean verifiyLogin() throws ClassNotFoundException, SQLException
{
	User user = new User(username, password);
	
	if (username.equals("")) {
		throw new MessageException("Username not informed.");
	} else if (password.equals("")) {
		throw new MessageException("Password not informed.");
	} 
	if (!(LoginDataAccess.getInstance().verifyCredentials(user))) {
		return true;
	} else {
		return false;
	}
}

public void setUserName(String name)
{
	username = name;
}
public void setPassword(String pass)
{
	password = pass;
}
}