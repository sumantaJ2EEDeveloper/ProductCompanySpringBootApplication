<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product View</title>
</head>
<body>
<h2>Hi I am in Product View JSP</h2>
<table border="2">
<tr><td><b>Product Id</b></td><td><b>Product Name</b></td><td><b>Product Price</b></td></tr>
<c:forEach items="${prdList}" var="prdList">
<tr>
<td>${prdList.productId}</td>
<td>${prdList.productName}</td>
<td>${prdList.productPrice}</td>
</tr>
</c:forEach>
</table>

<%-- <c:forEach items="${stb}" var="stb">
<table>
<tr>
<td>${stb.studentName}</td>
<td>${stb.collegeName}</td>
<td></td>
<td></td>
</tr>
</table>
</c:forEach> --%>

</body>
</html>