public abstract class Loan{
	public int accountNo;
	public String accountTitle;
	public String address;
	public String loanType;
	public String loanRemarks;
	public double loanAmount;
	public int noOfInstallments;
	public int installmentsPaid;
	public double totalToBePaid;
	public double totalPaid;
	public String nominee;
	public int loanTerm;
	public String startDate;
	public static final double rateOfInt = 4.5;

	public Loan(int ano, String title, String add, String lt, String rem, double lamnt,
 			int ints, int inpa, double totaltobep, double totalpa, String n, int lterm, String sdt){
		accountNo = ano;
		accountTitle = title;
		address = add;
		loanType = lt;
		loanRemarks = rem;
		loanAmount = lamnt;
		noOfInstallments = ints;
		installmentsPaid = inpa;
		totalToBePaid = totaltobep;
		totalPaid = totalp;
		nominee = n;
		loanTerm = lterm;
		startDate = sdt;
	}


	public abstract double calTotalToBePaid(double emi);

	public double calEMI(int p, double r, int l){
		r = r/100;
		return (p*r*Math.pow((1+r), n))/(Math.pow((1+r), (n-1));
	}

	public double payEMI(double amnt) {
		totalPaid += amnt;
	}
}