package model.dataccess;

public class DataAccessFactory {
	public DataAccess getDataAccess (String DataType)
	{
		if(DataType == null)
		{
			return null;
		}
			if(DataType.equalsIgnoreCase("postgres"))
		{
			return new LoginDataAccess();
		} 
			else if(DataType.equalsIgnoreCase("mySQL"))
		{
			//return new mySQL();
			return null;
		} 
		else if(DataType.equalsIgnoreCase("SQL server"))
		{
			//return new SQLServer();
			return null;
		}
			return null;
	}
}
