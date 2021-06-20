<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Add New Loan Details</h1>
	
	<form action="AddloanDetails" method="post">
		Branch Name : <input type="text" name="BranchName" placeholder="Enter Branch Name"><br>
		Start Date : <input type="text" name="stDate" placeholder="Enter Stated Date"><br>
		End Date : <input type="text" name="enDate" placeholder="Enter End Date"><br>
		Amount : <input type="text" name="amount" placeholder="Enter Loan Amout"><br>
		Rate : <input type="text" name="rate" placeholder="Enter Monthly Rate"><br>
		UserID : <input type="text" name="uID" placeholder="Enter User Name"><br>
		<input type="Submit" value="submit">
	</form>
	
	<a href="LoanManagerUI.jsp"><button type="Button">Back</button></a>
	
</body>
</html>