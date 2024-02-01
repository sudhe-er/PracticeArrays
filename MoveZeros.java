import java.util.*;
class MoveZeros{
	public static void main(String[] a){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] ar = new int[n];
		for(int i = 0; i < n; i++)
			ar[i] = s.nextInt();
		for(int i = 0; i < n; i++){
			if(ar[i]==0){
			    for(int j = i; j < n-1; j++){
				int t = ar[i];
				ar[i] = ar[j+1];
				ar[j+1] = t;
			}
				}
		}
System.out.println(Arrays.toString(ar));
	}
}		
