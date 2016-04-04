package net.shiv.database;

import java.sql.Statement;

public class DataBaseConnectionFactory {

	private String dbName;
	public DataBaseConnectionFactory(String DBName)
	{
		this.dbName = DBName;
	}
	
	public Statement getStatement()
	{
		if(dbName.equalsIgnoreCase("MYSQL"))
		{
			return new MySQL().getStatement();
		}
		return null;
	}
	public void  closeStatement()
	{
		if(dbName.equalsIgnoreCase("MYSQL"))
		{
			 new MySQL().closeStatement();
		}
	}
	
}
