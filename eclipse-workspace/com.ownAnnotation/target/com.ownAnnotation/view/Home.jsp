<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="process" modelAttribute="user">
Enter the phone no      <form:input path="phone"/>
<%-- Ennter the symbol<form:input path="symbol"/> --%>
ener the creditCadeno<form:input path="cardNO"/>
<form:errors path="cardNo"></form:errors>
<input type="submit">

</form:form>

</body>
</html>