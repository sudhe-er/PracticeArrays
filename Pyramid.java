import java.util.Scanner;
class Pyramid{
	public static void main(String[] a){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int space = n - 1;
		int i, j;
		//Printing first half
		for(j = 1; j <= n; j++){
			for(i = 1; i <= space; i++){
				System.out.print(" ");
			}
			space--;
			for(i = 1; i <= 2*j-1; i++){
				System.out.print("$");
			}
				System.out.println("");
		}
	}
}