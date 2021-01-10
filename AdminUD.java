package Project1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

import Project1.admin;
import Project1.iImpl.AdminDUImpl;

@WebServlet("/AdminUD")
public class AdminUD extends HttpServlet	{
	private static final long serialVersionUID = 1L;
		AdminDUImpl ud=new AdminDUImpl();
		admin us=new admin();
		
	public AdminUD() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException{
		System.out.println("Inside servlet");
		response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			us.setFirstname(request.getParameter("firstname"));
			us.setEmail(request.getParameter("email"));
			
			ud.update(us.getFirstname(), us.getEmail());
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException	{
		System.out.println("Inside servlet");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		((admin) us).setEmail(request.getParameter("email"));
		us.setPassword(request.getParameter("password"));
		
		ud.delete(request.getParameter("email"), request.getParameter("password"));
	}
}
