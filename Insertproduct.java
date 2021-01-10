package Project1.iImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Project1.insert;
import Project1.interfaces.iInsertProduct;

public class Insertproduct extends insert implements iInsertProduct {
	Connection con=null;
	PreparedStatement pre=null;
	public boolean isValid=false;
	
	insert i=new insert();
	public Insertproduct()	{
		
		System.out.println("Inside const");
		try {
			Class.forName("org.h2.Driver");
			System.out.println("Creating Connection");
			con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","DOTIN");
			System.out.println("Connection created yepiiiee");
		}
		catch (SQLException | ClassNotFoundException e)	{
			e.printStackTrace();	
		}
	}
   @Override
	public void insert(String name, String id, String description, String price, String ram, String url ) {
		System.out.println("Inside insert method");
		try {
			System.out.println(name+" "+id+" "+description+" "+price+" "+ram+" "+url);
			pre=con.prepareStatement("Insert into Product values(?,?,?,?,?,?)");
		pre.setString(1, name);
		pre.setString(2, id);
		pre.setString(3, description);
		pre.setString(4, price);
		pre.setString(5, ram);
		pre.setString(6, url);
		
		int res=pre.executeUpdate();
			if(res!=0)
			{
				System.out.println(""+res+" added succesfully");	
			}
			else
			{
				System.out.println("no product added");			
			}
		}	catch (SQLException e) {
			e.printStackTrace();
		}
	}

	

}
