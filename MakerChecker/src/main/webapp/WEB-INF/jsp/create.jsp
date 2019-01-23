<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function myFunction() {
    var dates = new Date();
    dd = dates.getDate(); 
    mm = dates.getMonth()+1;
    yy = dates.getFullYear();

if (document.getElementById('datetext').value == ''){
	document.getElementById('datetext').value = dd + '/' + mm + '/' + yy;
	}
	}
</script>
</head>
<body>

	<form:form modelAttribute="newRecord" action="" method="post">
	
	
	<form:input path="customerID" type="hidden" /><br><br/>
	
	<label for="customerCode">Customer Code</label>
	<form:input path="customerCode"/><br><br/>
	
	<label for="customerName">Customer Name</label>
	<form:input path="customerName"/><br><br/>
	
	<label for="customerAddress1" >Customer Address 1</label>
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
	
	
	<form:input path="recordStatus"  type="hidden"/>
	
	<label for="activeInactiveFlag">Active Inactive Flag</label>
	<form:select path="activeInactiveFlag">
	<option >A</option>
  	<option >I</option>
	</form:select><br><br/>
	
	
	<body onload="myFunction()">
	
	<form:input path="createDate" id="datetext" type="hidden"/>
	</body>
	

	<form:input path="createdBy" type="hidden"/>
	
	
	<form:input path="modifiedDate" type="hidden"/>
	
	
	<form:input path="modifiedBy" type="hidden"/>
	

	<form:input path="authorizedDate" type="hidden"/>
	
	
	<form:input path="authorizedBy" type="hidden"/>
	
	
	<input type="submit" value="submit">
	</form:form>
</body>
</html>