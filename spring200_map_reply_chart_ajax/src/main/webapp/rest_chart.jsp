<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
    	  //alert("function");
    	  $.ajax({
				url : "jsonResponse6",
				dataType : "json",
				success : function(list) {
					alert(list[0].work + " " + list[0].time)
					//2차원 배열--> 3개
					var arr2 = new Array(list.length + 1);
				    var header = ["Task", "hours"];
				    arr2[0] = header
				    //alert(data[0])
/* 					for(i = 0; i < list.length; i++){
				    	data[i + 1] = new Array(2)
				    	data[i + 1][0] = list[i].work;
				    	data[i + 1][1] = list[i].time;
						alert(arr2[i + 1])
					} */
					//2차원배열은 배열을 만들어서
					//1차원을 2차원배열에 하나씩 끼면 됨.
					for(i = 0; i < list.length; i++){
				    	one = new Array(2)
				    	one[0] = list[i].work;
				    	one[1] = list[i].time;
				    	arr2[i + 1] = one
					}
			        var data = google.visualization.arrayToDataTable(arr2);
			         /* [
			        	 	['Task', 'Hours per Day'], //인덱스0
			          		[list[0].work, list[0].time], //인덱스1
			          		[list[1].work, list[1].time], //인덱스2
			          		[list[2].work, list[2].time] //인덱스3
			        	 ]*/
			
			        var options = {
			          title: 'My Daily Activities'
			        };
			
			        var chart = new google.visualization.PieChart(document.getElementById('piechart'));
			
			        chart.draw(data, options);
			}//success
    	  })//ajax
		}//function
    </script>
</head>
<body>
	<div id="piechart" style="width: 900px; height: 500px;"></div>
</body>
</html>
