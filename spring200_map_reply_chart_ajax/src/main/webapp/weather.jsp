<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Insert title here</title>
<meta
	content='width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no'
	name='viewport'>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript" src="js/cors.js"></script>
<script type="text/javascript">
lat = '';
lon = '';
if (navigator.geolocation) {
	  navigator.geolocation.getCurrentPosition(showPosition);
	} else {
	  console.log("Geolocation is not supported by this browser.");
	}

	function showPosition(position) {
	  console.log("Latitude: " + position.coords.latitude);
	  lat = position.coords.latitude;
	  console.log("Longitude: " + position.coords.longitude);
	  lon =position.coords.longitude;
	}

	$(function() {
		$('#b1').click(function() {
			$.ajax({
				crossOrigin: true,
				url:'https://api.openweathermap.org/data/2.8/onecall?lat='+ lat +'&lon='+lon+'&exclude=hourly,daily,minutely&appid=43238037f8f84c1b9d70369513a425e6',
				dataType : 'json',
				success: function(x){
					console.log(x);
					$('#result').html("현재 위도, 경도 "+x.lat+ " , " + x.lon+"<br>"+
							"날씨 "+x.current.weather[0].description+"<br>"+
							"풍속 "+x.current.wind_speed+" m/s<br>"+
							"기온 "+(x.current.temp - 273.15).toFixed(1) + "°C<br>" +
							"체감 온도 "+(x.current.feels_like - 273.15).toFixed(1) + "°C<br>" +
							"구름 "+x.current.clouds+"%<br>")
				}
				
			})
		})
	})
					
</script>
</head>
<body>
	<button id="b1">날씨 알아오기!</button>
	<hr>
	<div id="result"></div>
</body>
</html>