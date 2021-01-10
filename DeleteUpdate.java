package Project1.iImpl;

import Project1.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import Project1.interfaces.UpdateDelete;

public class DeleteUpdate extends user implements UpdateDelete	{
	Connection con=null;
	PreparedStatement st=null;
	public boolean val=false;
	
	user ob=new user();
	public DeleteUpdate()	{
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
public void delete(String email, String password) {
	try	{
		String query="delete from customer where email='"+email+"' and password='"+password+"'";
		PreparedStatement st=con.prepareStatement(query);
		//Statement s=con.createStatement();
		val=false;
		System.out.println("enetered delete method.....");
		
		//System.out.print("Entered Delete method !!!");
		//String query="delete from customer where email=?";
		//st.setString(1,email);
		int res=st.executeUpdate();
		System.out.println(query);
		
		int rs = 0;
		if(rs>0)
		{
		//	System.out.println("Accessing if block !!!");
		/*String s1=rs.getString(1);
		String s2=rs.getString(2);*/
		val=true;
	//	System.out.print(s1+s2);
		}

		}	catch (SQLException e)	{
		e.printStackTrace();
		}
		
		
}


@Override
public void update(String firstname, String email) {
	System.out.println("inside update method");
	try {
		System.out.println(firstname+" "+email);
		 PreparedStatement pre = con.prepareStatement("Update customer SET firstname = ?  WHERE email = ?");
	
	pre.setString(1, firstname);
	pre.setString(2, email);
	
	int res=pre.executeUpdate();
	if(res>0)
	{
		System.out.println(""+res+" updated successfully");
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



