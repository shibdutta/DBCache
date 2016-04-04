package net.shiv.database;

import static org.junit.Assert.assertNotNull;

import java.sql.Statement;

import org.junit.Test;

public class TestDataBaseConnectionFactory {

	
	@Test
	public void testGetStatement()
	{
		DataBaseConnectionFactory dbFactory = new DataBaseConnectionFactory("MYSQL");
		
		Statement stmt = dbFactory.getStatement();
		
		assertNotNull(stmt); 
	}
}
