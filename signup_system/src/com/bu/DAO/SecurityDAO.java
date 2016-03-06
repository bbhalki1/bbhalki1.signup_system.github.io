package com.bu.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.bu.Db.ConnectionFactory;
import com.bu.FormBean.LoginForm;
import com.mysql.jdbc.ResultSetMetaData;



public class SecurityDAO {
	PreparedStatement pstmt,pstmt1,pstmt2;
	Statement stmt;
	ResultSet rs,rs1,rs2;
	Connection con;
	
	
	public SecurityDAO() throws IOException{
		// Database connection code
		con=ConnectionFactory.getConnection();
	}
	
	public ArrayList loginCheck(LoginForm lf)
	 {
		 ArrayList results = new ArrayList(); 
		 try{
			 con=ConnectionFactory.getConnection();
			 
			 System.out.println("in DAO implemetation connection"+con);	 
			 pstmt=con.prepareStatement("select p_name,p_id from p_login where p_id=? and Password=?");
			 
			 String pid=lf.getP_id();
			 System.out.println("in Security DAO class..... user_id is"+pid);
			 String pwd=lf.getPassword();
			 System.out.println("in Security DAO class.....password is"+pwd);
			 
			 pstmt.setString(1, pid);
			 pstmt.setString(2, pwd);
			 
			 rs=pstmt.executeQuery();
			 
		 
			 if(rs.next())
			 {
				String p_name = rs.getString(1);
				String p_id1 = rs.getString(2);
				 System.out.println("in result set login access is........."+p_name);
				 System.out.println("in result set login access is........."+p_id1);
				 
				 if(p_name!=null) {
					 pstmt1=con.prepareStatement("select s_bid,s_reason from appointment where p_id=? ");
					
					 pstmt1.setString(1, p_id1);
					 rs1=pstmt1.executeQuery();
					 ResultSetMetaData md = (ResultSetMetaData) rs1.getMetaData();  
					 int columns = md.getColumnCount();

					 while(rs1.next())
					 {
						 HashMap row = new HashMap();  
					     results.add(row);
					     for(int i=1; i<=columns; i++){  
					         row.put(md.getColumnName(i),rs1.getString(i));
					     }
					 }
				 }

			} 
			 
		
		 }
		 catch (Exception e) {
			 
			 e.printStackTrace();
			System.out.println("Exception raised"+e);
		}
		 return results;
	 }
}
	

