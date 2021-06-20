package loan;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataBase.loanDB;

@WebServlet("/ViewLoanDetails")
public class ViewLoanDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  brName = request.getParameter("loan");
		System.out.println(brName);
		try {
			
			
			List<Loan> details = loanDB.viewLoan(brName);
			request.setAttribute("detail", details);
			RequestDispatcher rd = request.getRequestDispatcher("ViewLoanDetails.jsp");
			rd.forward(request, response);
			
		}catch (Exception e) {
			e.getMessage();
		}
	}

}
