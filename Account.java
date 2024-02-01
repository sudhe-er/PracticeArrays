class Account{
	int bal;
	public Account(int amt){
		bal=amt;
	}
	public void deposit(Account this,int num){
		bal+=num;
		System.out.println(this.getClass().getName());
	}
	public static void main(String[] args){
		Account n=new Account(100);
		Account n1=n;
		n.deposit(100);
		System.out.println(n1.bal);
	}
}