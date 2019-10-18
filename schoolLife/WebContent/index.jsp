<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="./js/jquery-1.8.3.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
    #images{
        width: 50px;
        height: 50px;
    }
</style>
</head>
 <script type="text/javascript">
function a(){
	var aa = '{"leaderopenid":111111, "leaderwxname":"aaaaaa", "quename":"AAAAAA",	"introduce":"AAAAAAAA"}';
	console.log("进入");
	$.ajax({
		type: 'POST',
		url: 'http://localhost:8080/queue/que/creatqueue',/* http://localhost:8080/queue/user/showUser?id=1 */
		contentType: 'application/json',
		data : aa,
		dataType : "Json",
		traditional:true,
		success: function(data) {
			document.getElementById("div").innerHTML="成功!!!";
			console.log(data);
		},
		error: function() {
			document.getElementById("div").innerHTML="发生错误了!!!";
		}

	});
}
function b(){
	var aa = '{"id":1}';
	console.log("进入");
	$.ajax({
		type: 'POST',
		url: 'https://www.paion.xyz/queue/json/req',/* http://localhost:8080/queue/user/showUser?id=1 */
		contentType: 'application/json',
		data : aa,
		dataType : "Json",
		traditional:true,
		success: function(data) {
			console.log(data);
			document.getElementById("div").innerHTML="成功!!!";
		},
		error: function() {
			document.getElementById("div").innerHTML="发生错误了!!!";
		}

	});
}

function c(){
	var aa = '{"id":1}';
	console.log("进入");
	$.ajax({
		type: 'POST',
		url: 'https://www.paion.xyz/queue/json/reqc',/* http://localhost:8080/queue/user/showUser?id=1 */
		contentType: 'application/json',
		data : aa,
		dataType : "Json",
		traditional:true,
		success: function(data) {
			console.log(data);
			document.getElementById("div").innerHTML="成功!!!";
		},
		error: function() {
			document.getElementById("div").innerHTML="发生错误了!!!";
		}

	});
}

function d(){
	var aa = '{"code":"0214L2ZO01mTv32BehZO0wqLYO04L2ZX"}';
	console.log("进入");
	$.ajax({
		type: 'POST',
		url: 'http://localhost:8080/schoolLife/addDay',/* http://localhost:8080/queue/user/showUser?id=1 */
		contentType: 'application/json',
		data : aa,
		dataType : "JSON",
		traditional:true,
		success: function(data) {
			console.log(data);
			document.getElementById("div").innerHTML="成功!!!";
		},
		error: function() {
			document.getElementById("div").innerHTML="发生错误了!!!";
		}

	});
}
	
	function e(){
		var aa = '{"userid":"2", "queid":"0"}';
		console.log("进入");
		$.ajax({
			type: 'POST',
			url: 'https://www.paion.xyz/queue/user/joinQue',/* http://localhost:8080/queue/user/showUser?id=1 */
			contentType: 'application/json',
			data : aa,
			dataType : "String",
			traditional:true,
			success: function(data) {
				console.log(data.success);
				document.getElementById("div").innerHTML=data.success;
			},
			error: function() {
				document.getElementById("div").innerHTML="发生错误了!!!";
			}

		});
	}
	
	function f(){
		var aa = '{"QRcode":"11111", "id":"7"}';
		console.log("进入");
		$.ajax({
			type: 'POST',
			url: 'https://www.paion.xyz/queue/que/showQueById',/* http://localhost:8080/queue/user/showUser?id=1 */
			contentType: 'application/json',
			data : aa,
			dataType : "json",
			traditional:true,
			success: function(data) {
				document.getElementById("div").innerHTML="成功!!!";
			},
			error: function() {
				document.getElementById("div").innerHTML="发生错误了!!!";
			}

		});
	}
	
	function g(){
		var aa = '{"openid":"44444", "queid":"3"}';
		console.log("进入");
		$.ajax({
			type: 'POST',
			url: 'https://www.paion.xyz/queue/user/userIndex',/* http://localhost:8080/queue/user/showUser?id=1 */
			contentType: 'application/json',
			data : aa,
			dataType : "json",
			traditional:true,
			success: function(data) {
				document.getElementById("div").innerHTML="成功!!!";
			},
			error: function() {
				document.getElementById("div").innerHTML="发生错误了!!!";
			}

		});
	}
	
	function k(){
		console.log("进入");
		var aa = '{"scene":"queid=12879873"}';
		$.ajax({
			type: 'POST',
			url: 'http://localhost:8080/queue/que/QRcode',/* http://localhost:8080/queue/user/showUser?id=1 */
			contentType: 'application/json',
			dataType : "json",
			traditional:true,
			data:aa,
			success: function(data) {
				document.getElementById("div").innerHTML="成功!!!";
			},
			error: function() {
				document.getElementById("div").innerHTML="发生错误了!!!";
			}

		});
	}
</script>
<!-- <body>
<h1>测试页</h1>
<button onclick="a()">创建一个 queue</button>
<button onclick="b()">map 读测试</button>
<button onclick="c()">User 读测试</button>
<button onclick="d()">login 登录测试</button>
<button onclick="e()">加入队列测试</button>
<button onclick="f()">根据id查询队列测试</button>
<button onclick="g()">查询用户当前位次</button>
<button onclick="k()">POST测试</button>
<input type="button" id="but" onclick="a()">
<input type="button" id="but" onclick="b()">
<div id="div"> test</div>
<hr>
</body>  -->
<body>
    
    <form action="${pageContext.request.contextPath}/addDay" method="post" enctype="multipart/form-data">
    
        图片：<input type="file" name="file">
        	biaoti:<input id="" name="title" type="text" placeholder="" class="input-text size-L"><br>
			
			内容：<input id="" name="content" type="text" placeholder=" class="input-text size-L"><br>
			
        <input type="submit" value="提交">
      
				
    </form>

</body> 
</html>