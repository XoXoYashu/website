package Project1.iImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Project1.admin;
import Project1.interfaces.iAdmin;

public class AdminImpl extends admin implements iAdmin {
	Connection con=null;
	PreparedStatement st=null;
	public boolean isValid=false;

	admin i=new admin();
	public AdminImpl()	{
		System.out.println("inside const");
		try {
			System.out.println("creating driver manager");
			Class.forName("org.h2.Driver");
			System.out.println("creating connection");
			con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","DOTIN");
			System.out.println("connection created successfully");
			}catch (SQLException | ClassNotFoundException e)	{
				
				e.printStackTrace();
			}
		}
	
	@Override
	public void registration(String firstname, String lastname, String email, String password) {
		System.out.println("inside admin method");
		try	{
			System.out.println(firstname+" "+lastname+" "+email+" "+password);
			PreparedStatement pre = con.prepareStatement("Insert into ADMIN values(?,?,?,?)");
		pre.setString(1, firstname);
		pre.setString(2, lastname);
		pre.setString(3, email);
		pre.setString(4, password);

		int rs=pre.executeUpdate();
		 if(rs!=0)
		 {
			 System.out.println(""+rs+" added successfully");
		 }
		 else
		 {
			 System.out.println("no row added");
		 }
			
		}	catch	(SQLException e)	{
		e.printStackTrace();
		}

		
	}

	@Override
	public boolean login(String email, String password) {
		return false;
	}

}
