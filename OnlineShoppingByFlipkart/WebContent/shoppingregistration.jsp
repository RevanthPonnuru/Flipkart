<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flipkart Registration Page</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style>
.error{
	display: none;
	margin-left: 10px;
}		

.error_show{
	color: red;
	margin-left: 10px;
}
body {
 background-image: url("data:image/jpeg;base64,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");
 
}
h3{
color:#FFFF00;
}
p{
color:#00FF00;
}
</style>
</head>
<body>
<div class="container register">
                <div class="row">
               
                    <div class="col-md-3 register-left">
                        <img src="https://image.ibb.co/n7oTvU/logo_white.png" alt=""/>
                        <h3>Welcome</h3>
                        <p>You are 30 seconds away from your first experience of your own shopping!</p>
                        
                    </div>
                    <div class="col-md-9 register-right">
                        
                            
                                <form action ="ShoppingRegistrationController" method = "post" >
                                <div class="row register-form">
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <input type="text" class="form-control"  id= "userfirstname" name="firstname" required placeholder="First Name *"   />
                                            <span class= "error_show">The field is required</span>
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control"  id = "userlastname" name = "lastname"placeholder="Last Name *"  required />
                                            <span class= "error_show">The field is required</span>
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control" id= "userpassword"  name = "password"placeholder="Password *" required />
                                            <span class= "error_show">The field is required</span>
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="form-control" id= "userconfirmpassword" name = "confirmpassword"placeholder="Confirm Password * " required />
                                            <span class= "error_show">The field is required</span>
                                        </div>
                                        <div class="form-group">
                                            <div class="maxl">
                                                <label class="radio inline"> 
                                                    <input type="radio" name="gender" id="gendermale" value="male" checked>
                                                    <span> Male </span> 
                                                </label>
                                                <label class="radio inline"> 
                                                    <input type="radio" name="gender"  id= "genderfemale"value="female">
                                                    <span>Female </span> 
                                                </label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <input type="email" class="form-control" id="registeremail" name="registrationemail" placeholder="Your Email *" value="" />
                                            <span class= "error_show">The field is required</span>
                                        </div>
                                        <div class="form-group">
                                            <input type="text" minlength="10" maxlength="10" name="txtEmpPhone" class="form-control" placeholder="Your Phone *" value="" />
                                            <span class= "error_show">The field is required</span>
                                        </div>
                                        <div class="form-group">
                                            <select class="form-control">
                                                <option class="hidden"  selected disabled>Please select your Sequrity Question</option>
                                                <option>What is your Birthdate?</option>
                                                <option>What is Your old Phone Number</option>
                                                <option>What is your Pet Name?</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="form-control"  id= "useranswer" name = "answer"placeholder="Enter Your Answer *" value="" />
                                        </div>
                                        <input type="submit" class="btn btn-primary" id= "btnRegister"  name ="btnregistration"value="Register"/>
                                    </div>
                                </div>
                                 </form>
                            </div>
                            </div>
                            </div>
                           
                            
                        
                            
</body>
</html>
