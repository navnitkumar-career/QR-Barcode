<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@  taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 

	<h3>Product List</h3>

	<table border="1.5" cellpadding="2" cellspacing="2">

		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>QR code</th>
			<th>Bar code</th>
		</tr>
		<tbody>
			<c:forEach var="product" items="${products }">

				<tr>
					<td>${ product.id }</td>
					<td>${ product.name }</td>
					<td>${ product.price }</td>
					<td><img src="${pageContext.request.contextPath}/product/qrcode/${product.id}" width="500" height="500">
					</td>
					<td><img src="${pageContext.request.contextPath}/product/barcode/${product.id }" width="200" height="100">
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>



</body>
</html>