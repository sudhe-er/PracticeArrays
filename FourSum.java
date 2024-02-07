import java.util.*;
class FourSum{
	public static void main(String[] a){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = s.nextInt();
		ArrayList<ArrayList<Integer>>res = new ArrayList<>();
		int key = s.nextInt();
		Arrays.sort(arr);
		for(int i = 0; i < n-3; i++){
			for(int j = i+1; j < n-2; j++){
				ArrayList<Integer>in = new ArrayList<>();
				int k = j+1, l = n-1;
				while(k < l){
					if(arr[i]+arr[j]+arr[k]+arr[l] == key){
						in.add(arr[i]);
						in.add(arr[j]);
						in.add(arr[k]);
						in.add(arr[l]);
						k++;l--;
					}
					else if(arr[i]+arr[j]+arr[k]+arr[l] < key) k++;
					else l--;
				}res.add(in);
				
			}
		}
		System.out.println(res);
	}
}
						
	