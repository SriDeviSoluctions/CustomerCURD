<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@include file="includes.jsp" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Customer Management</title>
</head>
<body>
<h1>Customers Data</h1>
<form:form action="customer.do" method="POST" commandName="customer">
 <table>
  <tr>
    <td>Customer ID</td>
    <td><form:input path="customerId"/></td>
  </tr>
  <tr>
    <td>Customer Name</td>
    <td><form:input path="customerName"/></td>
  </tr>
  <tr>
    <td>First Name</td>
    <td><form:input path=fName"/></td>
  </tr>
  <tr>
    <td>Middle Name</td>
    <td><form:input path="mName"/></td>
  </tr>
  <tr>
    <td>Last Name</td>
    <td><form:input path="lName"/></td>
  </tr>
  <tr>
    <td>Phone Number</td>
    <td><form:input path="phoneNumber"/></td>
  </tr>
  <tr>
    <td>Address</td>
    <td><form:input path="customerAddress"/></td>
  </tr>
  <tr>
    <td colspan="2">
    <input type="submit" name="action" value="Add"/>
    <input type="submit" name="action" value="Edit"/>
    <input type="submit" name="action" value="Delete"/>
    <input type="submit" name="action" value="Search"/>
    
    </td>
  </tr>
 </table>
</form:form>

<table boarder="1">
  <tr>Customer ID</tr>
  <tr>First Name</tr>
  <tr>Middle Name</tr>
  <tr>Last Name</tr>
  <tr>Phone Number</tr>
  <tr>Address</tr>
  
  <c:forEach items="${customerList }" var="customer">
    <tr>
    <td>${customer.customerId }</td>
    <td>${customer.customerName }</td>
    <td>${customer.fName }</td>
    <td>${customer.mName }</td>
    <td>${customer.lName }</td>
    <td>${customer.phoneNumber }</td>
    <td>${customer.customerAddress }</td>
    </tr>
  </c:forEach>
</table>

</body>
</html>