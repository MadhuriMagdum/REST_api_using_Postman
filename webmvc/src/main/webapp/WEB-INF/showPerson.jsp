<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ Taglib prefix="c" uri="http://java.sun.com/jsp.jstl/core" %>
    
    <jsp:useBean id="person"  class="com.model.Person" scope="request"/>
    <jsp:setProperty name="person" property="*"/>
    
<!DOCTYPE html>
<html>
<head>
<title>Person Details</title>
</head>
<body>
<h2>done...</h2>
<h1>person Details</h1>
<p>Person id:  <c:out value="${person.id }" /></p>
<p>Person name:  <c:out value="${person.name}" /></p>
<p>Person phone:  <c:out value="${person.phone }" /></p>
</body>
</html>
 --%>
 <html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body bgcolor="skyblue">
<body >
<h2> done... show person..!!!</h2>  
      <a href="index.jsp" > Return to HomePage</a>
</body>
</html>
 