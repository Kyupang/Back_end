<!--  
웹소켓 통신
http는 한번 연결하고 끊는 방식이지만 

http pooling: 한번 요청하고 한번 응답하고 끝
http long pooling : 기일게 연결을 유지하는 것 

요청하면 승인하고 (핸드쉐이킹) 핸드쉐이킹을 유지하는 동안 데이터를 주거니 받거니 하는 것  


웹소켓 통신은 양방향 통신으로 연결성 통신이다.

ajax 방식의 통신이고

웹소켓이 있어야하고, 메시지 브로커가 있고 브라우저가 있고
들어가는 카테고리 주소가 있고 (/topic)
그걸로 들어갔을 때 데이터를 받는 주소가 따로 있다 (/app)(url)

stomp.js : 메시지를 쉽게 주거나 받을 수 있게 ajax 통신하는 기능 javs script 파일 라이브러리
sockjs : 소켓 객체 만들 수 있는 자바 스크립트 파일 
webSocketSendToUserAPP : 이건 아마 stomp가 부르는 function 외부 파일인듯.. 












-->
