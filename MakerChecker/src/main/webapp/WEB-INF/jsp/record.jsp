<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<c:url var="deleteM" value="/maker/deleteFromTemp">
			<c:param name="customerCode" value="${recordM.customerCode}" />
		</c:url>

		<c:url var="modifyM" value="/maker/modify">
			<c:param name="customerCode" value="${recordM.customerCode}" />
		</c:url>


		<c:url var="delete" value="/maker/deleteFromTemp1">
			<c:param name="customerCode" value="${record.customerCode}" />
		</c:url>

		<c:url var="modify" value="/maker/modify">
			<c:param name="customerCode" value="${record.customerCode}" />
		</c:url>

		<tr>
			<th>${record.customerCode}</th>
			<th>${record.customerName}</th>
			<th>${record.customerAddress1}</th>
			<th>${record.customerAddress2}</th>
			<th>${record.customerPincode}</th>
			<th>${record.customerEmail}</th>
			<th>${record.contactNumber}</th>
			<th>${record.privateContactPerson}</th>
			<th>${record.recordStatus}</th>
			<th>${record.activeInactiveFlag}</th>
			<th>${record.createDate}</th>
			<th>${record.createdBy}</th>
			<th>${record.modifiedDate}</th>
			<th>${record.modifiedBy}</th>
			<th>${record.authorizedDate}</th>
			<th>${record.authorizedBy}</th>
			<th><a href="${modify}">Modify</a></th>
			<th><a href="${delete}">Delete</a></th>


			<th>${recordM.customerCode}</th>
			<th>${recordM.customerName}</th>
			<th>${recordM.customerAddress1}</th>
			<th>${recordM.customerAddress2}</th>
			<th>${recordM.customerPincode}</th>
			<th>${recordM.customerEmail}</th>
			<th>${recordM.contactNumber}</th>
			<th>${recordM.privateContactPerson}</th>
			<th>${recordM.recordStatus}</th>
			<th>${recordM.activeInactiveFlag}</th>
			<th>${recordM.createDate}</th>
			<th>${recordM.createdBy}</th>
			<th>${recordM.modifiedDate}</th>
			<th>${recordM.modifiedBy}</th>
			<th>${recordM.authorizedDate}</th>
			<th>${recordM.authorizedBy}</th>
			<th><a href="${modifyM}">Modify</a></th>
			<th><a href="${deleteM}">Delete</a></th>
		</tr>
	</table>


</body>
</html>