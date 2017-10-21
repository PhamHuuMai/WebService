<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Demo webservice</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="./resources/js/javascript.js"></script>
</head>

<body>
	<div class="container">
		<!-- header  -->
		<div class="jumbotron" style="padding-top: 0px;">
			<h3>Demo webservice</h3>
			<img style="margin-left: 500px; height: 55;" src="lights.jpg"
				class="img-circle img-thumbnail" width="100" height="80">
		</div>
		<!-- tab  -->
		<ul class="nav nav-tabs">
			<li class="active"><a data-toggle="tab" href="#home">Home</a></li>
			<li><a data-toggle="tab" href="#menu1" onclick="loadMenu1()">KQXS MB</a></li>
			<li><a data-toggle="tab" href="#menu2" onclick="loadMenu2()">KQXS MN</a></li>
			<li><a data-toggle="tab" href="#menu3" onclick="loadMenu3()">KQXS Địa phương</a></li>
		</ul>
		<!-- content  -->
		<div class="tab-content">
			<div id="home" class="tab-pane fade in active">
				<div>
					<h4>Kết quả xổ số Miền Bắc</h4>
					<table>
						<tr>
							<td>Mở thưởng ngày :</td>
							<td><input type="date" name="date" id="date_home"></td>
							<td><input type="button" value="Tìm" onclick="findMenuHome()"></td>
						</tr>
					</table>
				</div>
				<div id="home_content"></div>
			</div>
			<div id="menu1" class="tab-pane fade">
				<div>
					<table>
						<tr>
							<h4>Kết quả xổ số Miền Bắc</h4>
							<td>Mở thưởng ngày :</td>
							<td><input type="date" name="date" id="date_menu1"></td>
							<td><input type="button" value="Tìm" onclick="findMenu1()"></td>
						</tr>
					</table>
				</div>
				<div id="menu1_content"></div>
			</div>
			<div id="menu2" class="tab-pane fade">
				<div>
					<table>
						<tr>
							<h4>Kết quả xổ số Miền Nam</h4>
							<td>Mở thưởng ngày :</td>
							<td><input type="date" name="date" id="date_menu2"></td>
							<td><input type="button" value="Tìm" onclick="findMenu2()"></td>
						</tr>
					</table>
				</div>
				<div id="menu2_content"></div>
			</div>
			<div id="menu3" class="tab-pane fade">
				<div>
					<h4>Kết quả xổ số địa phương</h4>
					<table>
						<tr>
							<td>Giải thưởng :</td>
							<td><select id="select">
									<option value="sss">aaaaa</option>
									<option>aaaaa</option>
									<option>aaaaa</option>
							</select></td>
						</tr>
						<tr>
							<td>Mở thưởng ngày :</td>
							<td><input type="date" name="date" id="date_menu3"></td>
							<td><input type="button" value="Tìm" onclick="findMenu3()"></td>
						</tr>
					</table>
				</div>
				<div id="menu3_content"></div>
			</div>
		</div>
</body>

</html>
