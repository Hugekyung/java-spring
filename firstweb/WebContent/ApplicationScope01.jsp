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
	try {
		int value = (int)application.getAttribute("value");
		value = value + 2;
		application.setAttribute("value", value);
%>
	<h1>value: <%=value %></h1>
<%
	} catch (NullPointerException e) {
%>
	<h1>설정된 value값이 없습니다.</h1>
<%
	}
%>
</body>
</html>