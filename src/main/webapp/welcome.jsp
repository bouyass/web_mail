<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Create an account</title>
    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
	<link rel="stylesheet" href="resources/css/welcome.css">
</head>
<body>
<nav class="navbar navbar-primary bg-primary">
  <p style="color:white;" class="navbar-brand">Lyes Mail</p>
   
  <form style="float:right;" class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button  class="btn btn-outline-light my-2 my-sm-0" type="submit"><img src="resources/images/search.svg">&nbsp;&nbsp; Search</button>
      <button onclick="document.forms['logoutForm'].submit()" class="btn btn-outline-light my-2 my-sm-0" type="submit"><img src="resources/images/logout.svg">&nbsp;&nbsp; Log out</button>
    </form>
    
</nav>
  <div style="margin-top:30px;width:90%;" class="container-fluid">
      <div class="row">
    <div class="actions col">
      <img src="resources/images/newMail.svg">&nbsp;&nbsp; <b>New mail</b>
    </div>
    <div class="actions col">

    </div>
    <div class="actions col">

    </div>
    <div class="actions col">

    </div>
    <div class="actions col">

    </div>
    
    <div class="actions col">

    </div>
    

  </div>
     <div  class="row">
    
    <div class="titles col col-xl-2">
    	<br/><br/>
      <ul>
      	<li><img class="list" src="resources/images/inbox.svg"> <a href="#"><b>&nbsp;&nbsp; Boite de réception</b></a></li>
      	<li><img class="list" src="resources/images/outbox.svg"> <a href="#"><b>&nbsp;&nbsp; Elements envoyes</b></a></li>
      	<li><img class="list" src="resources/images/draft.svg"> <a href="#"><b>&nbsp;&nbsp; Brouillon</b></a></li>
      	<li><img class="list" src="resources/images/spam.svg"> <a href="#"><b>&nbsp;&nbsp; Spam</b></a></li>
      	<li><img class="list" src="resources/images/trash.svg"> <a href="#"><b>&nbsp;&nbsp; Corbeille</b></a></li>
      </ul>
    </div>
    <div class="mail_data col col-xl-3">

    </div>
    <div class="mail_body  col">

    </div>
  </div>
  </div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
  <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>