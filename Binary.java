import java.util.Scanner;
class Binary{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int r  = 0;
		int cnt = 0;		
		while(num != 0){
			r += (Math.pow(10, cnt)*(num%2));
			num /= 2;
			cnt++;
		}
		System.out.println(r);
	}
}