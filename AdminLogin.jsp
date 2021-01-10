<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
<body> 
{
  font-family: Arial, Helvetica, sans-serif;
}

{
  box-sizing: border-box;
}

.container {
  position: relative;
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px 0 30px 0;
} 

input,
.btn {
  width: 100%;
  padding: 12px;
  border: none;
  border-radius: 4px;
  margin: 5px 0;
  opacity: 0.85;
  display: inline-block;
  font-size: 17px;
  line-height: 20px;
  text-decoration: none;
}

input:hover,
.btn:hover {
  opacity: 1;
}


input[type=submit] {
  background-color: #006652 ;
  color: white;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color:#660033 ;
}

.col {
  float: centre;
  width: 50%;
  margin: auto;
  padding: 0 50px;
  margin-top: 6px;
}

.row:after {
  content: "";
  display: table;
  clear: both;
}


.vl-innertext {
  position: absolute;
  top: 50%;
  transform: translate(-50%, -50%);
  background-color: #f1f1f1;
  border: 1px solid #ccc;
  border-radius: 50%;
  padding: 8px 10px;
}

.hide-md-lg {
  display: none;
}

.bottom-container {
  text-align: center;
  background-color: #666;
  border-radius: 0px 0px 4px 4px;
}

@media screen and (max-width: 650px) {
  .col {
    width: 100%;
    margin-top: 0;
  }
  /* hide the vertical line */
  .vl {
    display: none;
  }
  /* show the hidden text on small screens */
  .hide-md-lg {
    display: block;
    text-align: center;
  }
}
</style>
</head>
<body>

<h2>Admin Login</h2>

<div class="container">
  <form method="get" action="adminServlet">
    <div class="row">
      <h2 style="text-align:center">Login </h2>
      <div class="vl">
      </div>
      
      <div class="col">
        <div class="hide-md-lg">
          <p>sign in manually:</p>
        </div>
		<td>Email:</td>
        <input type="text" name="email" placeholder="e.g: Admin@" required>
        <td>Password:</td>
        <input type="password" name="password" placeholder="Password" required>
        <input type="submit" value="Login">
      </div>
      
    </div>
  </form>
</div>

<div class="bottom-container">
  <div class="row">
    <div class="col">
      <a href="Admin.jsp" style="color:white" class="btn">Sign up</a>
    </div>
    <div class="col">
      <a href="AdminUpdate.jsp" style="color:white" class="btn">Update</a>
    </div>
  </div>
</div>

</body>
</html>
