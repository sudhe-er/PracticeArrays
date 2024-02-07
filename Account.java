abstract class Account{
	String name;
	int ano;
	double balance;
	
	public Account(String n, int a, double b){
		name = n;
		ano = a;
		balance = b;
	}

	 public abstract void withdraw(int amnt);	
	
}

class SavingsAccnt extends Account{
	boolean chq;
	double bal;

	public SavingsAccnt(String n, int a, double b, boolean cq){
		super(n, a, b);
		chq = cq;
		bal = b;
	}

	
	public void deposit(int amnt){
		bal += amnt;
		System.out.println("Balance after deposit: "+bal);
	}

	public void withdraw(int amnt){
		if(bal > 0) System.out.println("Bal after withdraw: "+(bal-amnt));
		bal -= amnt;
	}

}














