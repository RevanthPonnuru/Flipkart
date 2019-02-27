<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
<h2>Description about the product</h2>

<!-- <p>Puglia's most famous sight is the unique conical houses (Trulli) found in the area around Alberobello, a declared UNESCO World Heritage Site.</p> -->

<figure>
  <img src="http://www.techwinter.com/wp-content/uploads/2015/09/LG-Front-Loading-Automatic-Washing.jpg" alt="Trulli" style="width:100%">
  <figcaption>
  1.Mitsibushi washing machine having front door with new features
  2.It has Life time warranty.
  3.Battery backup
  4.
  </figcaption>
</figure>
<button type="button" class="btn btn-success" onclick = "redirectLoginPage()">Buy Now</button>
<script>
function redirectLoginPage() {
  location.replace("shoppinglogin.jsp")
}
</script>
</body>

</html>