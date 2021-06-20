package loan;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataBase.loanDB;

@WebServlet("/DeleteLoanDetails")
public class DeleteLoanDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int loanID = Integer.parseInt(request.getParameter("loanId"));
		System.out.println(loanID);
		
		//meka use karann pop message ekk javascript valin livimataya
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
				
		boolean res = false;
		try {
			
			res = loanDB.deleteData(loanID);
			
			if(res==true) {
				out.println("<script type='text/javascript'>");
				out.println("alert('DELETED SUCCESSFUL!!!');");
				out.println("location='LoanManagerUI.jsp'");
				out.println("</script>");
			}
			else {
				out.println("<script type='text/javascript'>");
				out.println("alert('TRY AGAIN!');");
				out.println("location='ViewLoanDetails.jsp'");
				out.println("</script>");
			}
			
		}catch (Exception e) {
			e.getMessage();
		}
	}

}
