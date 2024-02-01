class FiveValuesPerLine{
	public static void main(String[] a){
		int cnt = 0;
		for(int i = 1; i <= 100; i+= 1){
			System.out.print(i+"  ");
			cnt++;
			if(cnt == 5){
			System.out.println();
			cnt = 0;}
		}
	}
}