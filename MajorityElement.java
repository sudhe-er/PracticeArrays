import java.util.*;
class MajorityElement{
	public static void main(String[] a){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		boolean flag = false;
		for(int i = 0; i < n; i++)
			arr[i] = s.nextInt();
		HashMap<Integer, Integer>map = new HashMap<>();
		for(int i : arr){
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		ArrayList<Integer> res = new ArrayList<>();

		for(Map.Entry<Integer, Integer> r : map.entrySet()){
			if(r.getValue() > n/2){
				res.add(r.getKey());
				flag = true;
			}
		}
		System.out.println(flag?Arrays.asList(res):-1);
	}
}			