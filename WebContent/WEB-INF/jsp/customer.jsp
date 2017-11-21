<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ include file="includes.jsp" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Customer Management</title>
<head>
<style>
div.shadow {
   -moz-box-shadow: 3px 3px 5px #777;
   -webkit-box-shadow: 3px 3px 5px #777;
   box-shadow: 3px 3px 5px #777;
}
div{

width:875px;
border:1px solid black;
padding:15px;
margin:5px;
}
</style>
</head>
<body>
<center>
<div class="shadow">
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
    <td>Product</td>
    <td><form:input path="product"/></td>
    
  </tr>
  <tr>
    <td>Mail Id</td>
    <td><form:input path="mailID"/></td>
    
  </tr>
  <tr>
    <td>Address</td>
    <td><form:input path="address"/></td>
    
  </tr>
  <tr>
    <td>Phone Number</td>
    <td><form:input path="phoneNumber"/></td>
    
  </tr>
  
  <tr>
    <td colspan="2">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" name="action" value="Add"/>
    <input type="submit" name="action" value="Edit"/>
    <input type="submit" name="action" value="Delete"/>
    <input type="submit" name="action" value="Search"/>
    
    </td>
  </tr>
 </table>
  <hr/>
</form:form>
<br/>
<table border="1">
 <tr>
 
  <td width="150"><b>Customer ID</b></td>
  <td width="150"><b>Customer Name</b></td>
  <td width="150"><b>Product</b></td>
  <td width="150"><b>Mail Id</b></td>
  <td width="150"><b>Address</b></td>
  <td width="150"><b>Phone Number</b></td>
  
  </tr>
  
  <c:forEach items="${customerList }" var="customer">
    <tr>
    <td width="150">${customer.customerId }</td>
    <td width="150">${customer.customerName }</td>
    <td width="150">${customer.product }</td>
    <td width="200">${customer.mailID }</td>
    <td width="250">${customer.address }</td>
    <td width="150">${customer.phoneNumber }</td>
    </tr>
  </c:forEach>
</table>
</div>
</center>
</body>
</html>