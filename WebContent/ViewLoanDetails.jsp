<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="ViewLoanDetails" method="post">
		<label>View Loan</label><br>

  		<input type="text" placeholder="Enter Branch Name.." name="loan">
  		<button type="submit"><i class="fa fa-search"></i>search</button>
  
	</form>
	
	<form action="DeleteLoanDetails" method="post">
		
			<c:forEach var="det" items="${detail}">
				Loan Id : ${det.loanId}
				User Name : ${det.userName}<br>
				Branch Name : ${det.branchName}<br>
				Started Date : <input type="text" name="stDate" value="${det.startDate}"><br>
				End Date : <input type="text" name="stDate" value="${det.endDate}"><br>
				Amount : <input type="text" name="stDate" value="${det.amount}"><br>
				Rate : <input type="text" name="stDate" value="${det.rate}"><br>
				<button type="submit" name="loanId" value="${det.loanId}">Delete</button>
				<a href="ViewLoanDetails.jsp"><button type="Button">Back</button></a>
				
			</c:forEach>
		</form>	
		
		
		
</body>
</html>