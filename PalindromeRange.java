class PalindromeRange{
	public static void main(String[] a){
		for(int i = 100; i < 200; i++){
			if(pal(i))
			System.out.println(i);
			}
	}
	static boolean pal(int j){
		int temp = j;
		int r = 0;
		while(j != 0 ){
			r += (r * 10 + j%10);
			j = j/10;
		}
		if(temp == r) return true;
		else return false;
	}
}
