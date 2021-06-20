package loan;

public class Loan {
	private int loanId;
	private String branchName;
	private String startDate;
	private String endDate;
	private float amount;
	private float rate;
	private String userName;
	
	public Loan(int loanId,String branchName, String startDate, String endDate, float amount, float rate, String userName) {
		this.loanId = loanId;
		this.branchName = branchName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.rate = rate;
		this.userName = userName;
	}
	
	public int getLoanId() {
		return loanId;
	}

	public String getBranchName() {
		return branchName;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public float getAmount() {
		return amount;
	}

	public float getRate() {
		return rate;
	}

	public String getUserName() {
		return userName;
	}
	
	
	
	

}
