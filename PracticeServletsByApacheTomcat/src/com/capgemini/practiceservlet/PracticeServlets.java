package com.capgemini.practiceservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class PracticeServlets
 */
@WebServlet(description = "It is having a simple code of how servlet works on..", urlPatterns = { "/PracticeServletsURL" })
public class PracticeServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter printwriter = response.getWriter();
		String username = request.getParameter("username");
		HttpSession httpsession =  request.getSession();
		httpsession.setAttribute("savedusername", username);
		printwriter.println("Request parameter has username as" +username);
		printwriter.println("Session parameter has username as" +(String) httpsession.getAttribute("savedusername"));
		//printwriter.println("<h1>Hello Banglore</h1>");
	}

}
