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
  background-image: url('https://image.businessinsider.com/5c16be9b2ab31e3bb437a5a3?width=1100&format=jpeg&auto=webp');

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
<div id="header">Welcome to Tienda Móvil</div>

<div class="parallax"></div>

<div style="height:600px;background-image: url('https://cdn.pocket-lint.com/r/s/970x/assets/images/149678-phones-review-oneplus-7t-review-image1-zs0pr3kb61.jpg')">
</div>

<div class="parallax"></div>

<div class="footer">
  <h2>Visit us:</h2>
  <p>Sign up as : <a href="Registration.jsp">
  User</a></p>
  <p>Sign up as : <a href="Admin.jsp">
  Admin</a></p>
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
