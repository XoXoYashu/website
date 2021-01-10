package Project1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

import Project1.user;
import Project1.iImpl.DeleteUpdate;


@WebServlet("/UpdateDelete")
public class UpdateDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       DeleteUpdate ud=new DeleteUpdate();
       user us= new user();
   
    public UpdateDelete() {
        super();
        
    }

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside servlet");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	
		((user) us).setEmail(request.getParameter("email"));
		us.setPassword(request.getParameter("pass"));
		
	
		ud.delete(request.getParameter("email"),request.getParameter("pass"));
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Inside servlet");
		response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			us.setFirstname(request.getParameter("firstname"));
			us.setEmail(request.getParameter("email"));
			
	
			ud.update(us.getFirstname(), us.getEmail());
			
} }
