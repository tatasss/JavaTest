<%@page import="fr.tempConverter.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	User user = (User) request.getSession().getAttribute("user");
	if(user == null){
		System.out.println("nu user session");
		response.sendRedirect("login");
	}

%>
<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
body {
	padding-top: 60px;
	/* 60px to make the container go all the way to the bottom of the topbar */
}

body {
	padding-top: 60px;
	padding-bottom: 40px;
	background-color: #f5f5f5;
}

.form-signin {
	max-width: 300px;
	padding: 19px 29px 29px;
	margin: 0 auto 20px;
	background-color: #fff;
	border: 1px solid #e5e5e5;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	border-radius: 5px;
	-webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	-moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
	box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
}

.form-signin .form-signin-heading, .form-signin .checkbox {
	margin-bottom: 10px;
}

.form-signin input[type="text"], .form-signin input[type="password"] {
	font-size: 16px;
	height: auto;
	margin-bottom: 15px;
	padding: 7px 9px;
}
</style>
<!-- Bootstrap -->
<link href="./assets/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<button type="button" class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="brand" href="#">Temperature Converter</a>
				<div class="nav-collapse collapse">
					<ul class="nav">
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>

	<div class="container">
		<h4>Celcius Value :</h4>
		<form class="form-search" method="post">
			<input type="text" class="input-medium search-query" name= "celcius">
			<button type="submit" class="btn">Convertir</button>
		</form>
		<h4>Fahrenheit</h4>
		<%
		if(request.getAttribute("result") !=null){
			out.write(request.getAttribute("result").toString());
		}
		%>


	</div>
	<script src="https://code.jquery.com/jquery.js"></script>
	<script src="./assets/js/bootstrap.min.js"></script>
	<script src="../assets/js/jquery.js"></script>
	<script src="../assets/js/bootstrap-transition.js"></script>
	<script src="../assets/js/bootstrap-alert.js"></script>
	<script src="../assets/js/bootstrap-modal.js"></script>
	<script src="../assets/js/bootstrap-dropdown.js"></script>
	<script src="../assets/js/bootstrap-scrollspy.js"></script>
	<script src="../assets/js/bootstrap-tab.js"></script>
	<script src="../assets/js/bootstrap-tooltip.js"></script>
	<script src="../assets/js/bootstrap-popover.js"></script>
	<script src="../assets/js/bootstrap-button.js"></script>
	<script src="../assets/js/bootstrap-collapse.js"></script>
	<script src="../assets/js/bootstrap-carousel.js"></script>
	<script src="../assets/js/bootstrap-typeahead.js"></script>
</body>
</html>