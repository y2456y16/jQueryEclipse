function callServer(){
	//form이 있으면 화면이 깨짐 -> 그래서 날려버림
	$.AJAXTestServer({
		
		//호출할 서버쪽 프로그램의 url
		url:"http://localhost:8080/AJAXTestServer/add",
		type:"get",//서버쪽에서 do get이 호출됨 / 전송방식
		//입력 값, 정해진 것 / 서버로 전송할 데이터
		data:{
			$("#input1").val(),
			$("#input2").val()
		},
		//성공하면 아래가 실행됨 / 성공하나서는 서버가 보내주는 데이터가 data에 저장됨
		success : function(data){
			$("span").text(data);
		}
		error : function(){
			alert("목표를 못찾겠다");
		}
	});// {객체 안}:객체
}