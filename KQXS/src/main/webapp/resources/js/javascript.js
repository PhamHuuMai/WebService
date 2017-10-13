window.onload = function() {
	// call ajax
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			document.getElementById("home").innerHTML = this.responseText;
		}
	};
	xhttp.open("GET", "./lottezy?lottezyId=sssss", true);
	xhttp.send();
}