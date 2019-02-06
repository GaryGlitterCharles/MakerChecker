<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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




<table>

			
	
				<tr>
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

	<form:form modelAttribute="modified" action="modifyupdateDetails" method="post">
	
	
	<form:input path="customerID" type="hidden" /><br><br/>
	
	<label for="customerCode">Customer Code</label>
	<form:input path="customerCode" value="${toModify.customerCode}"/><br><br/>
	
	<label for="customerName">Customer Name</label>
	<form:input path="customerName"  value="${toModify.customerName}" /><br><br/>
	
	<label for="customerAddress1" >Customer Address 1</label>
	<form:input path="customerAddress1" value="${toModify.customerAddress1}"/><br><br/>
	
	<label for="customerAddress2">Customer Address 2</label>
	<form:input path="customerAddress2" value="${toModify.customerAddress2}"/><br><br/>
	
	<label for="customerPincode">Customer Pincode</label>
	<form:input path="customerPincode" value="${toModify.customerPincode}"/><br><br/>
	
	<label for="customerEmail">Customer Email</label>
	<form:input path="customerEmail" value="${toModify.customerEmail}"/><br><br/>
	
	<label for="contactNumber">Contact Number</label>
	<form:input path="contactNumber" value="${toModify.contactNumber}"/><br><br/>
	
	<label for="privateContactPerson">Private Contact Person</label>
	<form:input path="privateContactPerson" value="${toModify.privateContactPerson}"/><br><br/>
	
	<label for="createDate">Created Date</label>
	<form:input path="createDate" value="${toModify.createDate}" readonly="true" /><br><br/>
	
	<form:input path="recordStatus"  type="hidden"/>
	
	<label for="activeInactiveFlag">Active Inactive Flag</label>
	<form:select path="activeInactiveFlag">
	<option >A</option>
  	<option >I</option>
	</form:select><br><br/>
	
	
	
	
	

	<form:input path="createdBy" type="hidden"/>
	
	<body onload="myFunction()">
	<form:input path="modifiedDate" id="datetext" type="hidden"/>
	</body>
	
	<form:input path="modifiedBy" type="hidden"/>
	

	<form:input path="authorizedDate" type="hidden"/>
	
	
	<form:input path="authorizedBy" type="hidden"/>
	
	
	<form:button>SUBMIT</form:button>
	</form:form>
</body>
</html>