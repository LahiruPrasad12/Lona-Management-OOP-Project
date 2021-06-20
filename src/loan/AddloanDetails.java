package loan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataBase.loanDB;

@WebServlet("/AddloanDetails")
public class AddloanDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//home eke enter karan new details tika capture kara ganima mehidi siduve
		String BName = request.getParameter("BranchName");
		String startDate = request.getParameter("stDate");
		String endDate = request.getParameter("enDate");
		float Amount = Float.parseFloat(request.getParameter("amount"));
		float Rate = Float.parseFloat(request.getParameter("rate"));
		String userID = request.getParameter("uID");
		
		//meka use karann pop message ekk javascript valin livimataya
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		boolean TrueFalse = false;
		
		try {
			TrueFalse = loanDB.addNewLoan(BName, startDate, endDate, Amount, Rate, userID);
			
			if(TrueFalse == true) {
				
				out.println("<script type='text/javascript'>");
				out.println("alert('LOAN DETAILS ADDED SUCCESSFULY! ');");
				out.println("location='LoanManagerUI.jsp'");
				out.println("</script>");
			}else {
				
				out.println("<script type='text/javascript'>");
				out.println("alert('TRY AGAIN!');");
				out.println("location='AddLoanDetails.jsp'");
				out.println("</script>");
			}
			
			
		}catch (Exception e) {
			e.getMessage();
		}
	}

}
