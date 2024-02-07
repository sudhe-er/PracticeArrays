abstract class Acount{
	String name;
	int accnt;
	double balance;
	
	public Acount(String n, int a, double b) {
		name = n;
		accnt = a;
		balance = b;
	}
	
	public void deposit(int amnt) {
		balance += amnt;
		System.out.println(balance+"Balance after deposit");
	}
	
	abstract void withdraw(Acount a, int amnt);

}

class SavingsAcnt extends Acount {
	public SavingsAcnt(String n, int a, double b) {
		super(n, a, b);
	}

	public void withdraw(Acount sa, int amnt) {
		if(sa.balance > 0) {
			sa.balance -= amnt;
			System.out.println("Bal after withdraw: "+sa.balance);
		}
		else {
			System.out.println("Insufficient Funds!");
		}
	}
}

class CurrentAcnt extends Acount {
	private boolean chqFacility;
	public CurrentAcnt(String n, int a, double b, boolean c) {
		super(n, a, b);
		chqFacility = c;
	}

	public void withdraw (Acount ca, int amnt) {
		if (chqFacility) {
			
			if (ca.balance-amnt > 1000) {
				ca.balance -= amnt;
				System.out.println("Bal after withdraw: "+ca.balance);
			}
			else {
			System.out.println("Balance can't be less than 1k");
			System.out.println("Try to withdraw: "+(amnt-1000));
			}
		} else {
			if(ca.balance > 0) {
				ca.balance -= amnt;
				System.out.println("Bal after withdraw: "+ca.balance);
			}
			else {
				System.out.println("Insufficient Funds!");
			}
		}
	}
	
}

class RecurringAcnt extends Acount {
	private int odiLimit;
	
	public RecurringAcnt (String n, int a, double b, int o ) {
		super(n, a, b);
		odiLimit = o;	
	}

	public void withdraw (Acount ra, int amnt ) {
		odiLimit -= 1;
		if(odiLimit <= 0 ) {
			System.out.println("Insufficient funds");
		}
		else {
			balance -= amnt;
			System.out.println("Bal after withdraw: "+ra.balance);
		}
	}
}







