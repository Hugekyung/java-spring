<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	pageContext.setAttribute("p1", "page scope value");
	request.setAttribute("r1", "request scope value");
	session.setAttribute("s1", "session scope value");
	application.setAttribute("a1", "application scope value");
%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- jsp 코드--%>
pageContext.getAttribute("p1") : <%=pageContext.getAttribute("p1") %><br><br>

<%-- el 코드 --%>
pageContext.getAttribute("p1") : ${pageScope.p1}<br>
resquest.getAttribute("r1") : ${requestScope.r1}<br>
session.getAttribute("s1") : ${sessionScope.s1}<br>
application.getAttribute("a1") : ${applicationScope.a1}<br><br>

<%-- 이름이 겹치지 않는다면 간결하게 작성 가능하다 --%>
pageContext.getAttribute("p1") : ${p1}<br>
resquest.getAttribute("r1") : ${r1}<br>
session.getAttribute("s1") : ${s1}<br>
application.getAttribute("a1") : ${a1}<br>

</body>
</html>