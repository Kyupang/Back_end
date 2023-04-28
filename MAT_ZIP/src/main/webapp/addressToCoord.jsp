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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=8ab6186bb587538d75199b2dc9588259&libraries=services"></script>
<script type="text/javascript">
	//현위치 가져오기. 좌표로
	var lat;
	var lon;
	
	
	 if (navigator.geolocation) {
		  navigator.geolocation.getCurrentPosition(showPosition);
		} else {
		  console.log("Geolocation is not supported by this browser.");
		}

		function showPosition(position) {
		  console.log("Latitude: " + position.coords.latitude);
		  lat = position.coords.latitude;
		  console.log("Longitude: " + position.coords.longitude);
		  lon = position.coords.longitude;
		
		  //지도그리기.	
		  var mapContainer = document.getElementById('map');// 지도를 표시할 div 
		  var mapOption = {
		    center: new kakao.maps.LatLng(lat, lon), // 지도의 중심좌표
		    level: 3 // 지도의 확대 레벨
		  };
		// 지도를 표시할 div와  지도 옵션으로  지도를 생성합니다
		  var map = new kakao.maps.Map(mapContainer, mapOption);
		}	 
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "Regi.mz",
				dataType : "json",
				success : function(json) {
					document.getElementById("map").innerHTML = "";
					
					storeAddress = json.storeAddress
					
					var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
					mapOption = {
						center : new kakao.maps.LatLng(lat, lon), // 지도의 중심좌표
						level : 3
					// 지도의 확대 레벨
					};
					
					var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

					
					// 주소-좌표 변환 객체를 생성합니다
					var geocoder = new kakao.maps.services.Geocoder();
					
					//주소가 "b" 이거나 "a" 라면 alert 하고 
					if(storeAddress === "k"){
						alert("등록 되셨습니다!!!!! 지도에 표시되려면 다음번에 한번 더 등록해주세요~");
					} else if (storeAddress === "a") {
						alert("찍어주신 주소와 일치하는 가게가 없습니다.");
					} else if(storeAddress === "b") {
						alert("영수증에 나와있는 결제일자 시간이 같습니다. 다른 영수증을 등록해주십시오");
					} else if(storeAddress === "c"){
						alert("주소 추출이 불가합니다. 개발자에게 문의하세요.");
					} else{
						// 주소로 좌표를 검색합니다
						
						geocoder.addressSearch(storeAddress, function(result, status) {

						    // 정상적으로 검색이 완료됐으면 
						     if (status === kakao.maps.services.Status.OK) {
								//좌표값 저장.
						        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);
								
						        
						        // 결과값으로 받은 위치를 마커로 표시합니다
						        var marker = new kakao.maps.Marker({
						            map: map,
						            position: coords
						        });

						        // 인포윈도우로 장소에 대한 설명을 표시합니다
						        var infowindow = new kakao.maps.InfoWindow({
						            content: '<div style="width:150px;text-align:center;padding:6px 0;">존맛집</div>'
						        });
						        infowindow.open(map, marker);

						        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
						        map.setCenter(coords);
						    } 
						}); 
					}
					
					
				} //success
			}) //ajax
		})// b1
		
		
		//to do list
		$('#b2').click(function() {
			$.ajax({
				url : "Remap.mz",
				dataType : "json",
				success : function(json) {
					document.getElementById("map").innerHTML = "";
					
					
					var mapContainer = document.getElementById('map'), // 지도를 표시할 div  
				    mapOption = { 
				        center: new kakao.maps.LatLng(lat, lon), // 지도의 중심좌표
				        level: 3 // 지도의 확대 레벨
				    };

					var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다
					
					
					for (var i = 0; i < json.length; i++) {
			            var obj = json[i];
			            // Access the properties of the object
			            var name = obj.name;
			            var address = obj.storeAddress;
			            
			            //쿼리를 사용해서 조건에 맞는 주소와 가게이름을 가져왔지만 
			            // 주소를 좌표로 변환해줘야 다 찍어줄 수 있다.!!
			            
			            var geocoder = new kakao.maps.services.Geocoder();
			            
			            geocoder.addressSearch(address, function(result, status) {
						    // 정상적으로 검색이 완료됐으면 
						     if (status === kakao.maps.services.Status.OK) {
								//좌표값 저장.
						       var latlng2 = new kakao.maps.LatLng(result[0].y, result[0].x);
						     } 
						});
			        }
					
					/* var positions = [];
					for (var i = 0; i < positions.length; i ++) {
					    positions.push({
					    	content = "<div>"+json[i].name+"</div>",
					    	//latlng: new kakao.maps.LatLng(lat2[i],lon2[i])
					    })
						console.log(positions)
						// 마커를 생성합니다
					    var marker = new kakao.maps.Marker({
					        map: map, // 마커를 표시할 지도
					        position: positions[i].latlng // 마커의 위치
					    });
						
					    // 마커에 표시할 인포윈도우를 생성합니다 
					    var infowindow = new kakao.maps.InfoWindow({
					        content: positions[i].content // 인포윈도우에 표시할 내용
					    });
	
					    // 마커에 mouseover 이벤트와 mouseout 이벤트를 등록합니다
					    // 이벤트 리스너로는 클로저를 만들어 등록합니다 
					    // for문에서 클로저를 만들어 주지 않으면 마지막 마커에만 이벤트가 등록됩니다
					    kakao.maps.event.addListener(marker, 'mouseover', makeOverListener(map, marker, infowindow));
					    kakao.maps.event.addListener(marker, 'mouseout', makeOutListener(infowindow));
					}
	
					// 인포윈도우를 표시하는 클로저를 만드는 함수입니다 
					function makeOverListener(map, marker, infowindow) {
					    return function() {
					        infowindow.open(map, marker);
					    };
					}
	
					// 인포윈도우를 닫는 클로저를 만드는 함수입니다 
					function makeOutListener(infowindow) {
					    return function() {
					        infowindow.close();
					    };
					}		 */
					
				} //success
			}) //ajax
		})//b2
	})// function	
	
</script>
	
	<button id="b1">맛집 등록 버튼.</button>
	<button id="b2">현위치 기반으로 맛집 표시</button>
	
	<div id="map" style="width:100%;height:350px;"></div>
</body>
</html>