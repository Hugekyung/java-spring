<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	StringBuffer url = request.getRequestURL(); // 내장 객체인 request 사용, stringbuffer: 데이터를 추가 가능한 문자열
	out.print("url: " + url.toString());
	out.print("<br>");
%>
</body>
</html>