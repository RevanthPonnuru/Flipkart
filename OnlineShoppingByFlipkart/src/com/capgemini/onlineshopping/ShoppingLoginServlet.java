package com.capgemini.onlineshopping;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.onlineshopping.dao.UserRegistration;
import com.capgemini.onlineshopping.shoppingpojoclasses.RegistartionPojo;
@WebServlet("/ShoppingLogin")
public class ShoppingLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingLoginServlet() {
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
		String Registrationemail = request.getParameter("loginemail");
		String Password = request.getParameter("loginpassword");
		PrintWriter printwriter = response.getWriter();
		UserRegistration userregistration = new UserRegistration();
		
			
		try {
			RegistartionPojo pojo =new RegistartionPojo(Password,Registrationemail);
		
			int i = userregistration.read(new RegistartionPojo(Password,Registrationemail));
			if(i>0) {
				printwriter.println(new UserRegistration().read(pojo));
				response.sendRedirect("shoppingindex.jsp");
			}
			
			else
				response.sendRedirect("shoppingregistration.jsp");

		}
		catch(Exception e) {
			e.printStackTrace();
		}
    }
}
		




    
