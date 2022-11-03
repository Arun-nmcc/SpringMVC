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

enter the name <form:input path="name"/>
<form:errors path="name"/>


<%-- Ennter the symbol<form:input path="symbol"/> --%>
ener the creditCadeno<form:input path="pin"/>
 <form:errors path="pin"></form:errors> 
<input type="submit">

</form:form>

</body>
</html>