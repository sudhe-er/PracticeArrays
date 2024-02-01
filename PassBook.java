class PassBook{
	public static void main(String[] a){
		Acnt a1 = new Acnt(101, "A", 1000);
		System.out.println(a1.getBalance());
		Acnt a2 = a1;
		a2.deposit(1300);
		//PassBook p = new PassBook();
		System.out.println(a2.getBalance());
	}
}
