class Acnt{
	private double balance;
	private int acnt_no;
	private String name;
	
	Acnt(int acnt_no, String name, double amnt){
		this.acnt_no = acnt_no;
		this.name = name;
		balance = amnt;
	}
	public void deposit(int val){
		balance += val;
		System.out.println(balance);
	}
	public double getBalance(){
		return balance;
	}
}
	