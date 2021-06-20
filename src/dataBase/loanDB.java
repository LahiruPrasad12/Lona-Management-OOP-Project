package dataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import loan.Loan;

public class loanDB {
	
	//new loan details add kirima mehidi siduve
	public static boolean addNewLoan(String BName,String startDate,String endDate,float Amount,float Rate,String userID) {
		boolean result = false;
		
		try {

			
			//add new loan details
			Connection connect = DBconnector.getConnection(); 
			Statement stm = connect.createStatement();
			String sql = "insert into loan.loan_details values(0,'"+BName+"','"+startDate+"','"+endDate+"','"+Amount+"','"+Rate+"','"+userID+"')";
			int res = stm.executeUpdate(sql);
			
			if(res>0) {
				result = true;
			}
			else {
				result = false;
			}
			
		}catch(Exception e) {
			e.getMessage();
		}
		//return state of user registration
		return result;
			
	}//End Of the addBusOwner method...
	
	
	//View Loan Data
	public static List<Loan> viewLoan(String brName){
		ArrayList<Loan> ar = new ArrayList<>();
		
		try {
			//branch name ekete anuva siyaluma data table eke labaganima memgin siduve
			Connection connect = DBconnector.getConnection(); 
			Statement stm = connect.createStatement();
			String sql = "select * from loan.loan_details where brachName = '"+brName+"'";
			ResultSet rs = stm.executeQuery(sql);
			
			if(rs.next()) {
				int loanID = rs.getInt(1);
				String BranchNam = rs.getString(2);
				String stDate = rs.getString(3);
				String enDate = rs.getNString(4);
				float amount = rs.getFloat(5);
				float rate = rs.getFloat(6);
				String userName = rs.getString(7);
				System.out.println(enDate);
				
				Loan ln = new Loan(loanID,BranchNam, stDate, enDate, amount, rate, userName);
				
				ar.add(ln);
			}
			
			
		}catch (Exception e) {
			e.getMessage();
		}
		
		return ar;
	}
	
	
	
	//delete loan data
	public static boolean deleteData(int loanID) {
		boolean ans = true;
		
		try {
			System.out.println(loanID);
			//user name ekete anuva  data table eke data delete kirima siduve
			Connection connect = DBconnector.getConnection(); 
			Statement stm = connect.createStatement();
			String sql = "delete from loan.loan_details where UserID = '"+loanID+"'";
			int result = stm.executeUpdate(sql);
			
			if(result>0) {
				ans = true;
				System.out.println(ans);
			}
			else {
				ans=false;
			}
				
		}catch (Exception e) {
			e.getMessage();
		}
		
		
		return ans;
		
	}
	

}
