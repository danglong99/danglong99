<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Cart Page</title>
</head>
<body>

<h3>Check Out</h3>
<form method="post" action="${pageContext.request.contextPath}/cart/saveOrder">
<table cellpadding="2" cellspacing="2" border="1">
    <tr>
        <td>Customer Name</td>
        <td><input type="text" name="customerName"></td>
    </tr>
    <tr>
        <td>Customer Address</td>
        <td><input type="text" name="customerAdress"></td>
    </tr>
    <tr>
        <td>Customer Number</td>
        <td><input type="text" name="customerNumber"></td>
    </tr>
    <tr>
        <td>&nbsp;</td>
        <td><input type="submit" name="Submit"></td>
    </tr>
</table>
<br>
</form>
</body>
</html>