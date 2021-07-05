<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Product Page</title>
</head>
<body>

<h3>Products Page</h3>
<table cellpadding="2" cellspacing="2" border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Price</th>
        <th>Producer</th>
        <th>Buy</th>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.id }</td>
            <td>${product.name }</td>
            <td>${product.price }</td>
            <td>${product.producer }</td>
            <td align="center">
                <a href="${pageContext.request.contextPath}/customer/buy/${product.id}">Buy Now</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>