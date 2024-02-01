import java.util.Scanner;
class Factorial{
	public static void main(String[] a){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int res = fact(n);
		System.out.println(res);
	}
	static int fact(int n){
	if(n==0) return 1;
	return n*fact(n-1);
	}
}