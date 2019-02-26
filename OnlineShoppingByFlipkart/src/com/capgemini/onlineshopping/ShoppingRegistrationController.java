package com.capgemini.onlineshopping;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


	public class ShoppingRegistrationController extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public ShoppingRegistrationController() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.setContentType("text/html");
		/* PrintWriter printwriter = response.getWriter(); */
			String Firstname = request.getParameter("firstname");
			String Lastname = request.getParameter("lastname");
			String Password = request.getParameter("password");
			String Confirmpassword = request.getParameter("confirmpassword");
			String Registrationemail = request.getParameter("registrationemail");
			String Useranswer = request.getParameter("answer");
		/*
		 * PrintWriter out = response.getWriter(); out.println("Revanth");
		 */
			if (Password.equals(Confirmpassword)) {
				
				RequestDispatcher requestdispatcher = request.getRequestDispatcher("registrationconfirmation.jsp");
				requestdispatcher.forward(request, response);
			}
			else {
				RequestDispatcher requestdispatcher = request.getRequestDispatcher("shoppingregistration.jsp");
				requestdispatcher.forward(request, response);
			}
		/*
		 * if(Firstname.isEmpty()||Lastname.isEmpty()||Password.isEmpty()||
		 * Confirmpassword.isEmpty()||Registrationemail.isEmpty()||Useranswer.isEmpty())
		 * { RequestDispatcher requestdispatcher =
		 * request.getRequestDispatcher("ShoppingRegistrationController"); printwriter.
		 * println("<font color=red>Please fill all the required fields</font>");
		 * requestdispatcher.include(request, response); } else {
		 * 
		 * }
		 */		}

	}

	

