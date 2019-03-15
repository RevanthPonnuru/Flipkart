<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Flipkart</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>
/* Remove the navbar's default rounded borders and increase the bottom margin */
.navbar {
	margin-bottom: 50px;
	border-radius: 0;
}

/* Remove the jumbotron's default bottom margin */
.jumbotron {
	margin-bottom: 0;
}

/* Add a gray background color and some padding to the footer */
footer {
	background-color: #f2f2f2;
	padding: 25px;
}
</style>
</head>
<body>

	<div class="jumbotron">
		<div class="container text-center">
		<img src = "https://images.financialexpress.com/2018/12/e-commerce-representational.jpg">
			<h1>Flipkart</h1>
			<p>Feel Free and Shop Fun</p>
		</div>
	</div>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="shoppingregistration.jsp"><span
							class="glyphicon glyphicon-user"></span> Sign up</a></li>
					<li><a href="shoppinglogin.jsp"><span
							class="glyphicon glyphicon-user"></span> Sign in</a></li>
							<% 
      if(session.getAttribute("username")==null)
      {
      %>
      	 
    	 
      <%
      }
      else
      {
      %>
      	 <li><a href="LogoutServlet"><span class="glyphicon glyphicon-user"></span> Logout</a></li>
      </ul>
      <%
      }	
      %>
					<li><a href="#"><span class="glyphicon glyphicon-user"></span>
							Your Account</a></li>
					<li><a href="#"><span
							class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading">LG Washing Machine</div>
					<div class="panel-body">
						<img
							src="http://www.techwinter.com/wp-content/uploads/2015/09/LG-Front-Loading-Automatic-Washing.jpg"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">LG washing machine having front
						door with new features</div>

				</div>
				<button type="button" class="btn btn-primary" id="lgwashingmachine"onclick="redirectLgPage()">Add To Cart
					Now(15000/-)</button>
			</div>

			<div class="col-sm-4">
				<div class="panel panel-danger">
					<div class="panel-heading">Whirpool</div>
					<div class="panel-body">
						<img
							src="http://www.techwinter.com/wp-content/uploads/2015/09/LG-Front-Loading-Automatic-Washing.jpg"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Having Top load with great
						feautures</div>

				</div>
				<button type="button" class="btn btn-primary" id="whirpoolwashingmachine" onclick= "redirectWhirpoolPage()">Add To Cart Now(17000/-)
					</button>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-success">
					<div class="panel-heading">Bosch</div>
					<div class="panel-body">
						<img
							src="http://www.techwinter.com/wp-content/uploads/2015/09/LG-Front-Loading-Automatic-Washing.jpg"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Having front load with extra
						battery backup</div>


				</div>
				<button type="button" class="btn btn-primary" id="boschwashingmachine" onclick= "redirectBoschPage()">Add To Cart
					Now(20000/-)</button>
			</div>
		</div>

	</div>
	<br>

	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading">Samsung</div>
					<div class="panel-body">
						<img
							src="http://www.techwinter.com/wp-content/uploads/2015/09/LG-Front-Loading-Automatic-Washing.jpg"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Having front load with extra
						battery backup</div>
				</div>
				<button type="button" class="btn btn-primary" id="samsungwashingmachine" onclick = "redirectSamsungPage()">Add To Cart
					Now (12000/-)</button>
			</div>

			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading">Mistibushi</div>
					<div class="panel-body">
						<img
							src="http://www.techwinter.com/wp-content/uploads/2015/09/LG-Front-Loading-Automatic-Washing.jpg"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Having front load with extra
						battery backup</div>

				</div>
				<button type="button" class="btn btn-primary" id="mistibushiwashingmachine" onclick = "redirectMitsibushiPage()">Add To Cart
					Now(14000/-)</button>

			</div>
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading">Panasonic</div>
					<div class="panel-body">
						<img
							src="http://www.techwinter.com/wp-content/uploads/2015/09/LG-Front-Loading-Automatic-Washing.jpg"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Having front load with extra
						battery backup</div>

				</div>
				<button type="button" class="btn btn-primary" id="panasonicwashingmachine" onclick = "redirectPanasonicPage()">Add To Cart
					Now(13000/-)</button>
			</div>

		</div>
	</div>
	<br>
	<br>

	<footer class="container-fluid text-center">
		<p>Online Store Copyright</p>
		<form class="form-inline">
			Get deals: <input type="email" class="form-control" size="50"
				placeholder="Email Address">
			<button type="button" class="btn btn-danger">Sign Up</button>
		</form>
	</footer>
<script>
function redirectLgPage() {
  location.replace("detaileddescriptionoflgproduct.jsp")
}
function redirectWhirpoolPage(){

	  location.replace("detaileddescriptionofwhirpool.jsp")
}
function redirectBoschPage(){
	location.replace("detaileddescriptionofbosch.jsp")
}
function redirectPanasonicPage(){
	location.replace("detaileddescriptionofpanasonic.jsp")
}
function redirectSamsungPage(){
	location.replace("detaileddescriptionofsamsung.jsp")
}
function redirectMitsibushiPage(){
	location.replace("detaileddescriptionofmitsibushi.jsp")
}
</script>
</body>
</html>
