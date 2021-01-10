<!DOCTYPE html>
<html lang="en">
<head>
<title>Tienda móvil</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>

* {
  box-sizing: border-box;
}


body {
  font-family: Arial, Helvetica, sans-serif;
  margin: 0;
}

/* Header/logo Title */
.header {
  padding: 80px;
  text-align: center;
  background:#990033;
  color: white;
}
/* Increase the font size of the heading */
.header h1 {
  font-size: 40px;
}

/* Style the top navigation bar */
.navbar {
  overflow: hidden;
  background-color: #333;
}

/* Style the navigation bar links */
.navbar a {
  float: left;
  display: block;
  color: white;
  text-align: center;
  padding: 14px 20px;
  text-decoration: none;
}

/* Right-aligned link */
.navbar a.right {
  float: right;
}

/* Change color on hover */
.navbar a:hover {
  background-color: #ddd;
  color: black;
}

/* Column container */
.row {  
  display: -ms-flexbox; /* IE10 */
  display: flex;
  -ms-flex-wrap: wrap; /* IE10 */
  flex-wrap: wrap;
}

.parallax {
  /* The image used */
  background-image: url("https://i.ytimg.com/vi/Ls_dxo6vNTc/maxresdefault.jpg");

  /* Set a specific height */
  min-height: 500px; 

 

/* Create two unequal columns that sits next to each other */
/* Sidebar/left column */
.side {
  -ms-flex: 30%; /* IE10 */
  flex: 30%;
  background-color: #f1f1f1;
  padding: 20px;
}

/* Main column */
.main {   
  -ms-flex: 70%; /* IE10 */
  flex: 70%;
  background-color: white;
  padding: 20px;
}

/* Fake image, just for this example */
.fakeimg {
  background-color: #aaa;
  width: 100%;
  padding: 20px;
}


/* Footer */
.footer {
  padding: 20px;
  text-align: center;
  background: #ddd;
}

/* Responsive layout - when the screen is less than 700px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 700px) {
  .row {   
    flex-direction: column;
  }
}

/* Responsive layout - when the screen is less than 400px wide, make the navigation links stack on top of each other instead of next to each other */
@media screen and (max-width: 400px) {
  .navbar a {
    float: none;
    width: 100%;
  }
}
</style>
</head>

<body>	

<section>
  <img class="mySlides" src="https://assets.mspimages.in/wp-content/uploads/2019/05/Xiaomi-Redmi-K20-Pro-696x365.jpg" width= 1276 height= 375>
  <img class="mySlides" src="https://i.ytimg.com/vi/Ls_dxo6vNTc/maxresdefault.jpg" width= 1276 height= 375>
  <img class="mySlides" src="https://cnet2.cbsistatic.com/img/hGOBCaF7KjajqcM8uvQsZl2hIrc=/980x551/2019/09/16/003d15f2-1f6b-4f88-9861-e9c83779c18f/apple-iphone-11-8.jpg" width= 1276 height= 375>
  <img class="mySlides" src="https://icdn2.digitaltrends.com/image/digitaltrends/galaxy-s10-plus-review-feat.jpg" width= 1276 height= 375>
</section>


<div class="navbar">
  <a href="Registration.jsp">Sign Up</a>
  <a href="Login.jsp">Login</a>
  <a href='#main'>View Product</a>
  <a href="#footer" class="right">Contact</a>
</div>

<div class="row">
  <div class="side">
    <h2>About Us</h2>
    <p>I really work very hard..... (-_-)</p>
    
 <section id="main">
  <div class="main">
    <h2>View Product</h2>
    <h5>Redmi k20 Pro</h5>
    <Image src="https://www.91-img.com/pictures/134335-v5-xiaomi-redmi-k20-pro-mobile-phone-large-1.jpg">
    <p>About....</p>
    <p>It is the flagship smartphone and sports a Qualcomm Snapdragon 855 SoC. This smartphone sports a 6.39-inch AMOLED display which makes
     it the first Redmi smartphone with an AMOLED display.
     The big display dominates the front of the smartphone and the K20 Pro has a 91.9% screen-to-body ratio.</p>
    <br>
            
    <h5>One Plus 7 Pro</h5>
    <Image src="https://www.91-img.com/pictures/133649-v9-oneplus-7-pro-mobile-phone-large-1.jpg">
    <p>About....</p>
    <p>The phone is powered by Octa core (2.84 GHz, Single core, Kryo 485 + 2.42 GHz, Tri core, Kryo 485 + 1.8 GHz, Quad core, Kryo 485) processor.
    It runs on the Qualcomm Snapdragon 855 Chipset.
    It has 6 GB RAM and 128 GB internal storage. OnePlus 7 smartphone has a Optic AMOLED display.</p>
    <br>
       <p><a href="ProductView.jsp">View More</a></p>
  </div>
  </section>   
  </div> 
</div>

<section id="footer">
<div class="footer">
 <h2 class="wide center">CONTACT</h2>
     <div class="row padding-32">
      <div class="col m6 large margin-bottom">
        <i class="fa fa-map-marker" style="width:30px"></i> Delhi, India<br>
        <i class="fa fa-phone" style="width:30px"></i> Phone: +91 7678566314<br>
        <i class="fa fa-envelope" style="width:30px"> </i> Email: yashu@gmail.com<br>
</div>
</div>
</div>
</section>
<script>
// Automatic Slideshow - change image every 3 seconds
var myIndex = 0;
carousel();

function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}
  x[myIndex-1].style.display = "block";
  setTimeout(carousel, 3000);
}
</script>
</body>
</html>
