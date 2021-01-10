<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<link rel="stylesheet" href="">



<%
String id=request.getParameter("userId");
String driverName = "org.h2.Driver";
String connectionUrl ="jdbc:h2:tcp://localhost/~/test";
String userId = "sa";
String password = "DOTIN";

try	{
Class.forName(driverName);
} catch	(ClassNotFoundException e)	{
	e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center"><font><strong>All Products</strong></font></h2>

<tr>

</tr>
<%
try	{
	connection = DriverManager.getConnection(connectionUrl, userId, password);
	statement=connection.createStatement();
	String sql="SELECT * FROM PRODUCT";
	
resultSet=statement.executeQuery(sql);
while(resultSet.next()){
%>

<main class="container">

	<img src="<%=resultSet.getString("url") %>">
<!-- Right Column -->
<div class="right-column">
	
	<div class="product-description">
		<span><%=resultSet.getString("name") %></span>
		<h1><%=resultSet.getString("id") %></h1>
		<p><%=resultSet.getString("description") %></p>
	</div>
	
	<div class="product-configuration">
	
	
		<div class="product-s">
			<span>Ram</span>
			
			<div class="ram">
				<button><%=resultSet.getString("ram") %></button>
			</div>
		
		<a href="#">Return Policy</a><BR>
		<A >Product Id:<%=resultSet.getString("id") %></A>
		</div>
	</div>


		<div class="price">
			<span><%=resultSet.getString("price") %></span>
			<a href="#" class="cart-btn">Add to cart</a>
		</div>
	</div>	
</main>

</tr>

<%
}

} catch (Exception e)	{
e.printStackTrace();	
}
%>
</table>
