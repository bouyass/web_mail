<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Log in with your account</title>

<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${contextPath}/resources/css/common.css" rel="stylesheet">
<link href="${contextPath}/resources/css/login.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.9.0/css/bulma-rtl.css" integrity="sha512-mP0kn0Fy+Dx+jCC3K4yEJufzSHFhszy1LOE4YvUOuFt1xwELuJI9W55FbKUaLswXc18ptZH17I3b40fn2jBbhw==" crossorigin="anonymous" />
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>


<body>



	<div style="position:absolute;margin-left:30%;margin-top:12%;" class="container">
		<div class="logo">
		<br/>
		<img src="resources/images/logo.png" />
	
	</div>
	&nbsp;&nbsp;&nbsp;&nbsp;
	
	<div class="form-container">
		<form method="POST" action="${contextPath}/login" class="form-signin">
			<h1 class="form-heading"><b>Log in</b></h1> 

			<div class="form-group ${error != null ? 'has-error' : ''}">
				<span id="message">&nbsp;&nbsp;&nbsp;&nbsp;${message}</span><br />
				<div class="field">
					<p class="control has-icons-left has-icons-right">
						<input name="email" class="form-control input" type="email" placeholder="Email">
						<span class="icon is-small is-left"> <i
							class="fas fa-envelope"></i>
						</span> <span class="icon is-small is-right"> <i
							class="fas fa-check"></i>
						</span>
					</p>
				</div>
				<div class="field">
					<p class="control has-icons-left">
						<input name="password" class="form-control input" type="password"
							placeholder="Password"> <span
							class="icon is-small is-left"> <i class="fas fa-lock"></i>
						</span>
					</p>
					<span id="error">&nbsp;&nbsp;${error}</span> <br/><input type="hidden"
						name="${_csrf.parameterName}" value="${_csrf.token}" /><br />
					<button class="btn btn-lg btn-primary  btn-block" type="submit">Log
						In</button>
					<br />
					<a href="#"> Forgot password ?</a>
					<a href="#"> Account creation demand</a>
					<br />
				</div>
			</div>
		</form>
		</div>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>