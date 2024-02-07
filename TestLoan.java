public class TestLoan {
	public static void main(String[] ar) {
		Loan ob = new HomeLoan(121, "Ram", "VZG", "Home", "Good", 1000000, 7,3,1100000, 33450, "sid", 12, "4/4/23");
		double emi = ob.calEMI(1000000, 7.2, 10);
		System.out.println("EMI: "+ emi);
		double sum = calTotalBePaid(emi);
		System.out.println("total amoount to be paid: "+ sum);
	}
}