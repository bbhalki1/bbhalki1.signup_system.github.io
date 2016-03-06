package com.bu.Action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bu.DAO.SecurityDAO;
import com.bu.FormBean.LoginForm;



public class LoginAction extends HttpServlet {


	public LoginAction() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}


	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String target ="";
		HttpSession session=request.getSession();
		LoginForm lf=new LoginForm();
		
		String p_id = request.getParameter("p_id");
		lf.setP_id(p_id);
		String password=request.getParameter("password");
		lf.setPassword(password);
		System.out.println("user_id"+p_id);
		System.out.println("password"+password);
		
		try{
		     ArrayList sArr = new SecurityDAO().loginCheck(lf);
		     System.out.println("in student_info is.........."+sArr);
		     
		     if(sArr.size() != 0){
		    	 session.setAttribute("sArr", sArr);
			     target = "./p_welcome.jsp"; 
		     }
		     else{
					session.setAttribute("status", "Invalid username&password");
					target = "./p_signup.jsp";	
		    	 
		     }
		     
		}catch (Exception e) {
		
			e.printStackTrace();
			
			
		}
			RequestDispatcher rd = request.getRequestDispatcher(target);
			rd.forward(request, response);
	  }
		
	

	public void init() throws ServletException {
		// Put your code here
	}

}
