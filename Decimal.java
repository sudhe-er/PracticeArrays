import java.util.Scanner;
class Decimal{
	public static void main(String[] a){
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		int n = s.nextInt();
		while(n != 0){
			int r = n % 10;
			sum += Math.pow(2, cnt) * r;
			n /= 10;
			cnt++;
		}
		System.out.println(sum);
	}
}