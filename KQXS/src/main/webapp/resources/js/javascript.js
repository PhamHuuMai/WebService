window.onload = function() {
	// call ajax
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("home_content").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "./lottezy?lottezyId=59e63b290cab9d375895c296", true);
	xhttp.send();
}

function findMenuHome() {
	// call ajax
	var date = document.getElementById("date_home").value;
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("home_content").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "./lottezy?lottezyId=59e63b290cab9d375895c296&date="+date, true);
	xhttp.send();
}

function findMenu1() {
	// call ajax
	var date = document.getElementById("date_menu1").value;
	alert("sssss" + date);
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("menu1_content").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "./lottezy?lottezyId=59e63b290cab9d375895c296&date="+date, true);
	xhttp.send();
}
function findMenu2() {
	// call ajax
	var date = document.getElementById("date_menu2").value;
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("menu2_content").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "./lottezy?lottezyId=59e63b290cab9d375895c297&date="+date, true);
	xhttp.send();
}

function findMenu3() {
	var date = document.getElementById("date_menu3").value;
	var select = document.getElementById("select").value;
	// call ajax
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("menu3_content").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "./lottezy?lottezyId=" + select + "&date=" + date, true);
	xhttp.send();
}

function loadMenu1() {
	// call ajax
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("menu1_content").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "./lottezy?lottezyId=59e63b290cab9d375895c296", true);
	xhttp.send();
}
function loadMenu2() {
	// call ajax
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("menu2_content").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "./lottezy?lottezyId=59e63b290cab9d375895c297", true);
	xhttp.send();
}
function loadMenu3() {
	// call ajax
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("select").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "./lottezies", true);
	xhttp.send();
	//
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("menu3_content").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "./lottezy?lottezyId=59e63b290cab9d375895c297", true);
	xhttp.send();
}

function convertDateToString(date) {
	// call ajax
//	date = 
}