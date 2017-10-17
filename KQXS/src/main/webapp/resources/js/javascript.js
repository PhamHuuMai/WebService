window.onload = function() {
	// call ajax
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("home_content").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "./lottezy?lottezyId=sssss", true);
	xhttp.send();
}

function findMenuHome() {
	// call ajax
	var date = document.getElementById("date_home").value;
	var dateTime = new Date(date);
	alert(dateTime.getTime());
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("home_content").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "./lottezy?lottezyId=sssss", true);
	xhttp.send();
}

function findMenu1() {
	// call ajax
	var date = document.getElementById("date_menu1").value;
	alert(date.getDate());
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("menu1_content").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "./lottezy?lottezyId=sssss", true);
	xhttp.send();
}
function findMenu2() {
	// call ajax
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("menu2_content").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "./lottezy?lottezyId=sssss", true);
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
			document.getElementById("select").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "./lottezies", true);
	xhttp.send();
}
function loadMenu2() {
	// call ajax
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("select").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "./lottezies", true);
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
}
