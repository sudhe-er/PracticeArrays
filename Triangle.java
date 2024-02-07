import java.util.*;
class Triangle{
	public static void main(String[] a){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i++)
			arr[i] = s.nextInt();
		Arrays.sort(arr);
		ArrayList<ArrayList<Integer>>res = new ArrayList<>();
		for(int i = 0 ; i < n-2; i ++){
			int j = i+1, k = n-1;
			while(j < k){
				ArrayList<Integer>in = new ArrayList<>();
					if(arr[i]+arr[j] > arr[k] )
					{
						in.add(arr[i]);
						in.add(arr[j]);
						in.add(arr[k]);
						j++; k--;
					}
					//k--;

				res.add(in);
}
			}
		System.out.println(res);
	}
}
						
