public class TestAccnt{
	public static void main(String[] a){
		//Upcasting
		Account a1 = null;
		SavingsAccnt s1 = new SavingsAccnt("Sid", 1212, 4000, false);
		a1 = s1;
		a1.withdraw(4001);
		//a1.deposit(999); -->this will raise an error as the compiler checks for the deposit method definition at the compile time as though they are in is-a relationship

		//Downcasting
		//s1 = a1;   --> we can't directly assign superclass reference holding subclass obj to subclass reference
		
		SavingsAccnt s2 = (SavingsAccnt)a1;
		//we can't directly assign superclass reference to subclass reference
		//we need to cast it explicitly to convert it into subclass as above
		s2.deposit(300);
	}
} 