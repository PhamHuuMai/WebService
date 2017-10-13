<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="./resources/js/javascript.js"></script>
</head>

<body>
	<div class="container">
		<!-- header  -->
		<div class="jumbotron" style="padding-top: 0px;">
			<h3>KQXS</h3>
			<img style="margin-left: 500px; height: 55;" src="lights.jpg"
				class="img-circle img-thumbnail" width="100" height="80">
		</div>
		<!-- tab  -->
		<ul class="nav nav-tabs">
			<li class="active"><a data-toggle="tab" href="#home">Home</a></li>
			<li><a data-toggle="tab" href="#menu1">KQXS MB</a></li>
			<li><a data-toggle="tab" href="#menu2">KQXS MN</a></li>
			<li><a data-toggle="tab" href="#menu3">KQXS Địa phương</a></li>
		</ul>
		<!-- content  -->
		<div class="tab-content">
			<div id="home" class="tab-pane fade in active"></div>
			<div id="menu2" class="tab-pane fade">3</div>
			<div id="menu3" class="tab-pane fade">4</div>
			<div id="menu1" class="tab-pane fade">2</div>
		</div>
</body>

</html>
