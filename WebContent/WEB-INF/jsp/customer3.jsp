<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ include file="includes.jsp" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Customer Management</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h1>Customers Data</h1>
<form:form action="customer.do" method="POST" commandName="customer">
 <div class="form-group">
      <label for="title">Customer Management</label>
              
   </div>
  <div class="form-group">
      <label for="isbn">Customer ID</label>
   <form:input path="customerId"/>
  </div>
  <div class="form-group">
      <label for="isbn">Customer Name</label>
   <form:input path="customerName"/>
  </div>
  <div class="form-group">
      <label for="isbn">Product</label>
   <form:input path="product"/>
  </div>
  <div class="form-group">
      <label for="isbn">Mail Id</label>
   <form:input path="mailID"/>
  </div>
  
  <div class="form-group">
     <label for="isbn">Address</label>
     <form:input path="address"/>
  </div>
  <div class="form-group">
     <label for="isbn">Phone Number</label>
     <form:input path="phoneNumber"/>
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</div>
</form:form>
</body>
</html>