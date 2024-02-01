import java.util.*;

class SumZero{
	public static void main(String[] a){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = s.nextInt();
		int i=0,j=1,tempsum=arr[i]+arr[j],sum=Integer.MAX_VALUE,t1=arr[i],t2=arr[j],s1=0,s2=0;
		int prevsum=sum;
		while(i<n){
			if(tempsum<0)
				tempsum=-tempsum;
			sum=Math.min(sum,tempsum);
			if(prevsum!=sum){
				s1=t1;
				s2=t2;
				prevsum=sum;
			}
			
			if(j<n){
				tempsum=arr[i]+arr[j];
				t1=arr[i];
				t2=arr[j];
			}
			j++;
			if(j>=n){
				i++;
				j=i+1;
			}
		}
		System.out.print(s1+" "+s2);
	}
}