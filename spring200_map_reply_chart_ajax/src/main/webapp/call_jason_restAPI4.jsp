<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- content delivery network  : CDN -->
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script>
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "jasonResponse6",
				dataType : "json",
				success: function(json) {
					work1 = json[0].work
					percent1 = json[0].percent
					
					work2 = json[1].work
					percent2 = json[1].percent
					
					work3 = json[2].work
					percent3 = json[2].percent
					
					work4 = json[3].work
					percent4 = json[3].percent
					
					// Load the Visualization API and the corechart package.
				      google.charts.load('current', {'packages':['corechart']});

				      // Set a callback to run when the Google Visualization API is loaded.
				      google.charts.setOnLoadCallback(drawChart);

				      // Callback that creates and populates a data table,
				      // instantiates the pie chart, passes in the data and
				      // draws it.
				      function drawChart() {
						
				        // Create the data table.
				        var data = new google.visualization.DataTable();
				        data.addColumn('string', 'Working');
				        data.addColumn('number', 'time');
				        data.addRows([
				        	[work1,percent1],
				        	[work2,percent2],
				        	[work3,percent3],
				        	[work4,percent4]
				        ]);

				        // Set chart options
				        var options = {'title':'내 생활 일과표',
				                       'width':400,
				                       'height':300};

				        // Instantiate and draw our chart, passing in some options.
				        var chart = new google.visualization.PieChart(document.getElementById('chart_div'));
				        chart.draw(data, options);
				      }
				}
			}) 
		})

	})
</script>

	<button id="b1">googleChart에 json 데이터를 넣어보자~</button>
	<div id="chart_div"></div>
</body>
</html>