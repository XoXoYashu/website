package Project1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Project1.insert;
import Project1.iImpl.Insertproduct;


@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Insert() {
       
    }
    
    	insert i=new insert();
    	Insertproduct se=new Insertproduct();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside Servlet");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		i.setName(request.getParameter("name"));
		i.setId(request.getParameter("id"));
		i.setDescription(request.getParameter("description"));
		i.setPrice(request.getParameter("price"));
		i.setRam(request.getParameter("ram"));
		i.setUrl(request.getParameter("url"));
		
		se.insert(i.getName(), i.getId(),i.getDescription(), i.getPrice(), i.getRam(), i.getUrl());
	}

}
