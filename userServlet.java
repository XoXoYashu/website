package Project1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Project1.user;
import Project1.iImpl.ServiceImpl;



public class userServlet extends HttpServlet	{
	
	public userServlet()	{
		
	}
	user ob=new user();
	ServiceImpl si=new ServiceImpl();
	
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException	{
response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	
		boolean res=si.login(request.getParameter("email"),request.getParameter("password"));
		if(res)
		{
			out.println("Logged IN !!!");
			RequestDispatcher rs=request.getRequestDispatcher("HomePage.jsp");
			rs.forward(request, response);
			
		}
		else
		{
			  
			out.println("Invalid credentia"
					+ "ls !!!");
		}
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException	{
	System.out.println("Inside servlet");
	response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		ob.setFirstname(request.getParameter("firstname"));
		ob.setLastname(request.getParameter("lastname"));
		ob.setEmail(request.getParameter("email"));
		ob.setPassword(request.getParameter("password"));
		
		si.registration(ob.getFirstname(), ob.getLastname(), ob.getEmail(), ob.getPassword());
		RequestDispatcher rs=request.getRequestDispatcher("HomePage.jsp");
		rs.forward(request, response);
		
		
	
}
}


