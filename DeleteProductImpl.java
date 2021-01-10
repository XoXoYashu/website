package Project1.iImpl;

import Project1.insert;
import Project1.interfaces.iDeleteProduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteProductImpl extends insert implements iDeleteProduct {
	Connection con=null;
	PreparedStatement st=null;
	public boolean val=false;
	
	insert ob=new insert();
	public DeleteProductImpl() {
		System.out.println("inside const");
		try	{
			System.out.println("creating driver manager");
		Class.forName("org.h2.Driver");
		System.out.println("Creating connection");
		con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","DOTIN");
		System.out.println("Connection created succesfully");
		} catch	(SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}


@Override
public void delete(String name, String id) {
	try	{
		String query="delete from PRODUCT where name='"+name+"' and id='"+id+"'";
		PreparedStatement st=con.prepareStatement(query);
		val=false;
		System.out.println("entered delete method.....");
		int res=st.executeUpdate();
		System.out.println(query);
		
		int rs=0;
		if(rs>0)
		{
			val=true;
		}
		
	}	catch (SQLException e)	{
		e.printStackTrace();
	}
}

@Override
public void update(String id, String description, String price, String ram, String url) {
	System.out.println("inside product update method");
	try	{
		System.out.println(id+" "+description+" "+price+" "+ram+" "+url);
		PreparedStatement pre =con.prepareStatement("Update insert SET description = ?, price = ?, ram = ?, url = ?, where id = ?");
				
				pre.setString(1, id);
				pre.setString(2, description);
				pre.setString(3, price);
				pre.setString(4, ram);
				pre.setString(5, url);
				
				int res=pre.executeUpdate();
				if(res>0)
				{
					System.out.println(""+res+" product inserted succesfully");
				}
				else
				{
					System.out.println("no row updated");
				}
				}	catch (SQLException e)	{
					e.printStackTrace();
	}
}
}
