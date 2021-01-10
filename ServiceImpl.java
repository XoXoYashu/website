package Project1.iImpl;

import Project1.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Project1.interfaces.iService;

public class ServiceImpl extends user implements iService	{
	Connection con=null;
	PreparedStatement st=null;
	public boolean val=false;
	
	user ob=new user();
	public ServiceImpl()	{
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


public void registration(String firstn, String lastn, String email, String password)	{
	System.out.println("inside register method");
try	{
	System.out.println(firstn+" "+lastn+" "+email+" "+password);
	st=con.prepareStatement("Insert into customer values(?,?,?,?)");
st.setString(1, firstn);
st.setString(2, lastn);
st.setString(3, email);
st.setString(4, password);

int rs=st.executeUpdate();
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

public boolean login(String name, String password)
{
	
try	{
Statement s=con.createStatement();
val=false;
System.out.print("Entered login method !!!");
String query="select * from customer where email='"+name+"' and password='"+password+"'";
ResultSet rs=s.executeQuery(query);
System.out.println(query);
if(rs.next())
{
	System.out.println("Accessing if block !!!");
String s1=rs.getString(1);
String s2=rs.getString(2);
val=true;
System.out.print(s1+s2);
}

}	catch (SQLException e)	{
e.printStackTrace();
}
return val;
}



}
