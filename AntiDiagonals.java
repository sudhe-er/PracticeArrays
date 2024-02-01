import java.util.*;
class AntiDiagonals{
	public static void main(String[] a){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				arr[i][j] = s.nextInt();
			}
		}
		ArrayList<ArrayList<Integer>>outer = new ArrayList<>();
		int p= 0, q=0;	
		for(int k = 0; k < 2 * n - 1; k++){
				if(k >= n){
					p += 1; q = n-1;
				}
				
				ArrayList<Integer>inner = new ArrayList<>();
			for(int i = p, j = q; i < n && j >= 0; i++, j--){
				inner.add(arr[i][j]);
			}
		outer.add(inner);
		q++;
		}
		
		System.out.println(outer);
		}
	}
				
