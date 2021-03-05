<%@page import="org.apache.catalina.filters.ExpiresFilter.XServletOutputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
hello
<%
	System.out.print("jspService()");
%>

<%! // <%!: 서비스 바깥쪽에 선언하기 위한 방법
	public void jspInit(){
	System.out.print("jspInit()!!!!");
}
%>

<%!
	public void jspDestroy(){
	System.out.print("jspDestroy()");
}
%>
</body>
</html>