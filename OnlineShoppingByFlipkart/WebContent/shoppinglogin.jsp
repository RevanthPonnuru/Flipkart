<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
   <!--Made with love by Mutiullah Samim -->
   
	<!--Bootsrap 4 CDN-->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    
    <!--Fontawesome CDN-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	<!--Custom styles-->
	<link rel="stylesheet" type="text/css" href="styles.css">
	<style type="text/css">
	body {
 background-image: url("data:image/jpeg;base64,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");
 
}
	</style>
</head>
<body>
<div class="container">
 
    <div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body">
            <h5 class="card-title text-center">Sign In</h5>
            <form class="form-signin" action ="ShoppingLogin" method = "post" >
              <div class="form-label-group">
                <input type="email" id="inputEmail" class="form-control"  name = "loginemail"placeholder="Email address" required autofocus>
                <label for="inputEmail">Email address</label>
              </div>

              <div class="form-label-group">
                <input type="password" id="inputPassword" class="form-control" name = "loginpassword" placeholder="Password" required>
                <label for="inputPassword">Password</label>
              </div>

              <div class="custom-control custom-checkbox mb-3">
                <input type="checkbox" class="custom-control-input"  name = "rememberpassword"id="customCheck1">
                <label class="custom-control-label" for="customCheck1">Remember password</label>
              </div>
              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Sign in</button>
              <hr class="my-4">
              <button class="btn btn-lg btn-google btn-block text-uppercase" type="submit" name = "signitwithgoogle"><i class="fab fa-google mr-2"></i> Sign in with Google</button>
              <button class="btn btn-lg btn-facebook btn-block text-uppercase" type="submit" name = "signitwithfacebook"><i class="fab fa-facebook-f mr-2"></i> Sign in with Facebook</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>