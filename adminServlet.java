package Project1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Project1.admin;
import Project1.iImpl.AdminImpl;

@WebServlet("/adminServlet")
public class adminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public adminServlet() {	
		}
	
			admin i=new admin();
			AdminImpl se=new AdminImpl();
			
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException	{
	response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		boolean res=se.login(request.getParameter("email"),request.getParameter("password")); 
		if(res)
		{
			out.println("logged In");
			RequestDispatcher rs=request.getRequestDispatcher("AdminWelcome.jsp");
			rs.forward(request, response);
					}
		else
		{
			out.println("please enter correct"
					+ "value !!!");
		}
	
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException	{
		System.out.println("Inside servlet");
		response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			i.setFirstname(request.getParameter("firstname"));
			i.setLastname(request.getParameter("lastname"));
			i.setEmail(request.getParameter("email"));
			i.setPassword(request.getParameter("pass"));
			
			se.registration(i.getFirstname(), i.getLastname(), i.getEmail(), i.getPassword());
			
			RequestDispatcher rs=request.getRequestDispatcher("AdminWelcome.jsp");
			rs.forward(request, response);
			
	}

}
