<%-- 
    Document   : student-list
    Created on : May 21, 2017, 5:49:14 PM
    Author     : suresh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Student List</h1>
    </body>
    <c:set var="name" scope="application" value="rajan"></c:set>
    <h1>Name: ${name}</h1>
  
    
</html>
