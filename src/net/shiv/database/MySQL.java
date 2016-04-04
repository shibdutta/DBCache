package net.shiv.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL {
	   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/shivsch";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	   
	   private Connection conn = null;
	   private Statement stmt = null;
	   
	   
	   public Statement getStatement()
	   {
	   
	   try{
	      Class.forName("com.mysql.jdbc.Driver");

	      //System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);

	      //System.out.println("Creating database...");
	      stmt = conn.createStatement();
	      
	      //String sql = "CREATE DATABASE STUDENTS";
	      //stmt.executeUpdate(sql);
	      //System.out.println("Database created successfully...");
	   
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      
	   }//end try
	   return stmt;
	   }
	   
	   public void closeStatement()
	   {
		 //finally block used to close resources
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }// nothing we can do
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try 
	   }
}
