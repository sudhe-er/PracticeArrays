import java.util.*;
class AllFourSum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		System.out.println("Enter the key : ");
	 	int key=sc.nextInt();
		Arrays.sort(ar);
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n-3;i++){
			if(i>0 && ar[i]==ar[i-1]) continue;
			for(int j=i+1;j<n-2;j++){
				if(j>i+1 && ar[j]==ar[j-1]) continue;
				int k=j+1,l=n-1;
				while(k<l){
					int sum=ar[i]+ar[j]+ar[k]+ar[l];
					if(sum==key){
						ArrayList<Integer> temp=new ArrayList<Integer>();
						temp.add(ar[i]);
						temp.add(ar[j]);
						temp.add(ar[k++]);
						temp.add(ar[l--]);
						res.add(temp);
						while(k<l && ar[k]!=ar[k-1]) k++;
						while(k<l && ar[l]!=ar[l+1]) l--;
					}
					else if(sum<key)k++;
					else l--;		
				}
			}	
		}
		System.out.println(res.toString());
	}
}