package com.capgemini.practiceservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PracticeXmlServlet extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	//response.getWriter().append("Served at: ").append(request.getContextPath());
      response.setContentType("text/html"); 	
		PrintWriter printwriter = response.getWriter();
		String username = request.getParameter("username");
		printwriter.println("Hello"+ username); 
		printwriter.println("Hello Banglore");
	
	}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	//response.getWriter().append("Served at: ").append(request.getContextPath());
      response.setContentType("text/html"); 	
		PrintWriter printwriter = response.getWriter();
		String username = request.getParameter("username");
		String fullname = request.getParameter("fullname");
		printwriter.println("Hello This is Your FullName"+ fullname);
		String designation = request.getParameter("Designation");
		printwriter.println("Your Designation is" +designation);
		String[] location = request.getParameterValues("location");
		printwriter.println("You are at"+ location.length + "places");
		for( int i=0;i<location.length;i++) {
			printwriter.println(location[i]);
		}
		//printwriter.println("Hello Banglore");
	
	}
}