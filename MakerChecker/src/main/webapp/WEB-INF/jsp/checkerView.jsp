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

			<c:forEach items="${viewRecords}" var="element">
	
					<c:url var="authorize" value="/checker/authorize">
						<c:param name="customerCode" value="${element.customerCode}" />
					</c:url>
					
					<c:url var="reject" value="/checker/reject">
						<c:param name="customerCode" value="${element.customerCode}" />
					</c:url>
	
				<tr>
					<th>${element.customerID}</th>
					<th>${element.customerCode}</th>
					<th>${element.customerName}</th>
					<th>${element.customerAddress1}</th>
					<th>${element.customerAddress2}</th>
					<th>${element.customerPincode}</th>
					<th>${element.customerEmail}</th>
					<th>${element.contactNumber}</th>
					<th>${element.privateContactPerson}</th>
					<th>${element.recordStatus}</th>
					<th>${element.activeInactiveFlag}</th>
					<th>${element.createDate}</th>
					<th>${element.createdBy}</th>
					<th>${element.modifiedDate}</th>
					<th>${element.modifiedBy}</th>
					<th>${element.authorizedDate}</th>
					<th>${element.authorizedBy}</th>
					<th><a href="${authorize}">Authorize</a></th>
					<th><a href="${reject}">Reject</a></th>
				</tr>
				
				<tr>
			</c:forEach>
		</table>
		
	
</body>
</html>