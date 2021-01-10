package Project1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

import Project1.insert;
import Project1.iImpl.DeleteProductImpl;

@WebServlet("/ProductDelete")
public class ProductDelete extends HttpServlet	{
	private static final long serialversionUID = 1L;
		DeleteProductImpl ud=new DeleteProductImpl();
		insert us=new insert();
		
		
	public ProductDelete() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException	{
			System.out.println("Inside servlet");
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			((insert) us).setName(request.getParameter("name"));
			us.setId(request.getParameter("id"));
			
			ud.delete(request.getParameter("name"), request.getParameter("id"));
	}
	
	protected void doget(HttpServlet request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("Inside servlet");
		response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			us.setId(request.getInitParameter("id"));
			us.setDescription(request.getInitParameter("description"));
			us.setPrice(request.getInitParameter("Price"));
			us.setRam(request.getInitParameter("ram"));
			us.setUrl(request.getInitParameter("url"));
			
			String url;
			String ram;
			String price;
			ud.update(us.setId("id"), us.setDescription("description"), us.setPrice(price), us.setRam(ram), us.setUrl(url));
		
	}
}