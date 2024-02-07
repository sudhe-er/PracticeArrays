import java.util.Scanner;

public class HomeLoan implements Loan {
	public HomeLoan(int ano, String title, String add, String lt, String rem, double lamnt,
 			int ints, int inpa, double totaltobep, double totalpa, String n, int lterm, String sdt) {
		super(int ano, String title, String add, String lt, String rem, double lamnt,
 			int ints, int inpa, double totaltobep, double totalpa, String n, int lterm, String sdt);
	}

	public double calEMI(int p, double r, int l){
		r = r/100;
		return (p*r*Math.pow((1+r), l))/(Math.pow((1+r), (l-1));
	}

	public double calTotalToBePaid(double emi) {
		double interest = loanAmount*(loanTerm/100)*loanTerm;
		return totalToBepaid+interest;
	}

}
