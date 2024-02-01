import java.util.Scanner;
class DuplicateRemoving{
	public static void main(String[] a){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] ar = new int[n];
		for(int i = 0; i < n; i++)
		ar[i] = s.nextInt();
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(ar[i] == ar[j]){
					for(int k = j; k < n - 1; k++){
						ar[k] = ar[k+1];
					}	
				//ar[n-1] = 0;
				//n=n-1;
			}
		}
		}
		ar[n-1]=0;
		for(int i : ar)
		System.out.println(i);

	}
}
