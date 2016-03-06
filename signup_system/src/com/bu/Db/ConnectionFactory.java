package com.bu.Db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	 public static Connection con=null;
	 public static Connection getConnection()
	 {
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signup_system","root", "admin");
		 } 
		 catch (Exception e) {
		   System.out.println("Connection Failed! Check output console");
		   e.printStackTrace();
		 }
	  return con;
	 }

	}
