package Project1.iImpl;

import Project1.admin;
import Project1.interfaces.iAdminUpDe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminDUImpl extends admin implements iAdminUpDe {
	Connection con=null;
	PreparedStatement st=null;
	public boolean val=false;
	
	admin ob=new admin();
	public AdminDUImpl() {
		System.out.println("inside const");
		try {
			System.out.println("creating driver manager");
		Class.forName("org.h2.Driver");
		System.out.println("creating connection");
		con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","DOTIN");
		System.out.println("connection created successfully");
		}catch (SQLException | ClassNotFoundException e){
			
			e.printStackTrace();
		
	}	
}

@Override
public void update(String firstname, String email)	{
	System.out.println("inside admin update method");
	try	{
		System.out.println(firstname+" "+email);
		PreparedStatement pre = con.prepareStatement("Update admin SET firstname = ? WHERE email = ?");
		
		pre.setString(1, firstname);
		pre.setString(2, email);
		
		int res=pre.executeUpdate();
		if(res>0)
		{
			System.out.println(""+res+" admin updated succesfully");
		}
		else
		{
			System.out.println("no row updated");
		}
		}	catch (SQLException e)	{
			e.printStackTrace();
		}
}

@Override
public void delete(String email, String password)	{
	try {
		String query="delete from admin where email='"+email+"' and password='"+password+"'";
		PreparedStatement st=con.prepareStatement(query);
		val=false;
		System.out.println("entered delete method....");
		int res=st.executeUpdate();
		System.out.println(query);
		
		int rs=0;
		if(rs>0)
		{
			val=true;
		}
		
		}catch (SQLException e)	{
			e.printStackTrace();
	}
}
}
