import java.util.Scanner;
class Diamond{
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
				System.out.print("K");
			}
				System.out.println("");
		}
		space = 1;
		//Printing second half
		for(j = 1; j <= n-1; j++){
			for(i = 1; i <= space; i++){
				System.out.print(" ");
			}
			space++;
			for(i=1; i <= 2 * (n-j) - 1; i++){
				System.out.print("K");
			}
			System.out.println("");
		}
	}
}