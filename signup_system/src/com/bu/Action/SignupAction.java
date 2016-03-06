package com.bu.Action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bu.DAO.SignupDAO;
import com.bu.FormBean.signupform;


public class SignupAction extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public SignupAction() {
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

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		signupform sf = new signupform();
		String p_id = request.getParameter("p_id");
		sf.setP_id(p_id);
		String s_bid = request.getParameter("s_bid");
		sf.setS_bid(s_bid);
		String s_reason = request.getParameter("s_reason");
		sf.setS_reason(s_reason);
		
		System.out.println(p_id);
		System.out.println(s_bid);
		System.out.println(s_reason);
		
		try{
		     Boolean flag = new SignupDAO().signup(sf);
		     System.out.println(flag);
		}catch (Exception e) {
		
			e.printStackTrace();
			
		}
		
		
		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
