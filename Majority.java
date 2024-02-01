import java.util.*;
class Majority{
	public static void main(String[] a){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = s.nextInt();
		ArrayList<Integer>res = new ArrayList<>();
		int i = 0, j = 1;
		while(i < n){
			if(j == n )
			{ 	
				res.add(arr[i]);
				i++;
				j = i+1;
			}
			
			else  if(arr[i] < arr[j])
			{
				i++;
				j = i+1;
				continue;
			}
			 
			else if(arr[i] > arr[j]){
				j++;   
			}
			
		}
		System.out.println(Arrays.asList(res));
	}
}