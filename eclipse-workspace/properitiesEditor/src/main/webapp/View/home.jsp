<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="pro" modelAttribute="bill">
amount<form:input path="amount"/>
<%-- <form:input path="currency"/> --%>
date<form:input path="date"/>
<%-- <form:input path="cardNo"/> --%>
<input type="submit">
</form:form>



</body>
</html>