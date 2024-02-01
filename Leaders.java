import java.util.Scanner;
class Leaders{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements : ");
		int n=sc.nextInt();
		int[] ar=new int[n]; 
		for(int i=0;i<n;i++){
			ar[i]=sc.nextInt();
		}
		int[] res=new int[n];
		int big=ar[n-1],j=0;
		res[j++]=big;
		for(int i=n-2;i>=0;i--){
			if(ar[i]>big){
				res[j++]=ar[i];
				big=ar[i];
			}
		}
		for(int i=j-1;i>=0;i--){
			System.out.print(res[i]+" ");
		}
	}
}