<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

#header {
  background-color: #800000;
  padding: 40px 10px;
  color: black;
  text-align: center;
  font-size: 50px; 
  font-weight: bold;
  position: fixed;
  top: 0;
  width: 100%;
  transition: 0.2s;
}
body, html {
  height: 100%;
}

.footer {
  padding: 20px;
  text-align: center;
  background: #ddd;
}

.parallax {
  /* The image used */
  background-image: url('https://www.91-cdn.com/pricebaba-images/images/product/mobile/59170/nokia-8-1-raw-269175.jpg');

  /* Full height */
  height: 100%; 

  /* Create the parallax scrolling effect */
  background-attachment: fixed;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}


</style>
</head>
<body>
<div id="header">Welcome Admin</div>

<div class="parallax"></div>

<div style="height:600px;background-image: url('https://cdn-files.kimovil.com/default/0003/11/thumb_210125_default_big.jpeg')">
</div>

<div class="parallax"></div>

<div class="footer">
  <h2>Admin:</h2>
  <p>Update: <a href="Update.jsp">
  Update</a></p>
  <p>Delete : <a href="Delete.jsp">
  Delete</a></p>
</div>


<script>
// When the user scrolls down 50px from the top of the document, resize the header's font size
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 50 || document.documentElement.scrollTop > 50) {
    document.getElementById("header").style.fontSize = "20px";
  } else {
    document.getElementById("header").style.fontSize = "40px";
  }
}

</script>
</body>
</html>
