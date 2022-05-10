package model.dataccess;

import java.sql.SQLException;

import model.entities.User;

public interface DataAccess {
	public Boolean verifyCredentials(User user) throws ClassNotFoundException, SQLException;
}
