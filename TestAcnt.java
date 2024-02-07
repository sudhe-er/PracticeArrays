public class TestAcnt {
	public static void main(String[] ar) {
		
	Acount a = new SavingsAcnt("Ram", 1210, 4000);
	a.withdraw(a,3750);

	Acount b = new CurrentAcnt("sid", 1216, 3000, true);
	b.withdraw(b, 3000);

	Acount c = new RecurringAcnt("Jai", 1256, 2000, 3);
	for(int i = 0; i < 4; i++)
		c.withdraw(c, 1000);

	}
}