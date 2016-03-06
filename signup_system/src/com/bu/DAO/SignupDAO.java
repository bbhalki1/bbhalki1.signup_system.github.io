package com.bu.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bu.Db.ConnectionFactory;
import com.bu.FormBean.signupform;
import java.sql.PreparedStatement;


public class SignupDAO {
	PreparedStatement pstmt;
	PreparedStatement pstmt1,pstmt2;
	Statement stmt;
	ResultSet rs,rs1,rs2;
	Connection con;
	
	
	public SignupDAO() throws IOException{
		// Database connection code
		con=ConnectionFactory.getConnection();
	}
	
	public Boolean signup(signupform sf)
	 {
		Boolean flag= false;
		 
		 try{
			 con=ConnectionFactory.getConnection();
			 
			 System.out.println("in DAO implemetation connection"+con);	 
			 pstmt=con.prepareStatement("insert into appointment(p_id,s_bid,s_reason ) values (?,?,?)");
			 
			 String p_id=sf.getP_id();
			 System.out.println("in Security DAO class..... user_id is"+p_id);
			 String s_bid=sf.getS_bid();
			 System.out.println("in Security DAO class.....password is"+s_bid);
			 String s_reason = sf.getS_reason();
			 System.out.println("in Security DAO class.....reason is"+s_reason);
			 
			 pstmt.setString(1, p_id);
			 pstmt.setString(2, s_bid);
			 pstmt.setString(3, s_reason);

			 int i=pstmt.executeUpdate();
			 if(i>0)
			 {
				 flag=true;
			 }
		
		 }
		 catch (Exception e) {
			 
			 e.printStackTrace();
			System.out.println("Exception raised"+e);
		}
		 return flag;
	 }
}
	