<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form modelAttribute="newRecord" action="" method="post">
	
	
	<form:input path="customerID" type="hidden" /><br><br/>
	
	<label for="customerCode">Customer Code</label>
	<form:input path="customerCode"/><br><br/>
	
	<label for="customerName">Customer Name</label>
	<form:input path="customerName"/><br><br/>
	
	<label for="customerAddress1">Customer Address 1</label>
	<form:input path="customerAddress1"/><br><br/>
	
	<label for="customerAddress2">Customer Address 2</label>
	<form:input path="customerAddress2"/><br><br/>
	
	<label for="customerPincode">Customer Pincode</label>
	<form:input path="customerPincode"/><br><br/>
	
	<label for="customerEmail">Customer Email</label>
	<form:input path="customerEmail"/><br><br/>
	
	<label for="contactNumber">Contact Number</label>
	<form:input path="contactNumber"/><br><br/>
	
	<label for="privateContactPerson">Private Contact Person</label>
	<form:input path="privateContactPerson"/><br><br/>
	
	<label for="recordStatus">Record Status</label>
	<form:input path="recordStatus"/><br><br/>
	
	<label for="activeInactiveFlag">Active Inactive Flag</label>
	<form:input path="activeInactiveFlag"/><br><br/>
	
	<label for="createDate">Create Date</label>
	<form:input path="createDate"/><br><br/>
	
	<label for="createdBy">Created By</label>
	<form:input path="createdBy"/><br><br/>
	
	<label for="modifiedDate">Modified Date</label>
	<form:input path="modifiedDate"/><br><br/>
	
	<label for="modifiedBy">Modified By</label>
	<form:input path="modifiedBy"/><br><br/>
	
	<label for="authorizedDate">Authorized Date</label>
	<form:input path="authorizedDate"/><br><br/>
	
	<label for="authorizedBy">Authorized By</label>
	<form:input path="authorizedBy"/><br><br/>
	
	
	<input type="submit" value="submit">
	</form:form>
</body>
</html>