<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
	<form:form action="" modelAttribute="customerCode" method="post">
Enter the customerCode: <form:input path="customerCode"/>
<form:button>submit</form:button>
	</form:form>

<table>

			
	
				<tr>
					<th>${toModify.customerID}</th>
					<th>${toModify.customerCode}</th>
					<th>${toModify.customerName}</th>
					<th>${toModify.customerAddress1}</th>
					<th>${toModify.customerAddress2}</th>
					<th>${toModify.customerPincode}</th>
					<th>${toModify.customerEmail}</th>
					<th>${toModify.contactNumber}</th>
					<th>${toModify.privateContactPerson}</th>
					<th>${toModify.recordStatus}</th>
					<th>${toModify.activeInactiveFlag}</th>
					<th>${toModify.createDate}</th>
					<th>${toModify.createdBy}</th>
					<th>${toModify.modifiedDate}</th>
					<th>${toModify.modifiedBy}</th>
					<th>${toModify.authorizedDate}</th>
					<th>${toModify.authorizedBy}</th>
				</tr>
				
				<tr>
			
		</table>




	
</body>
</html>