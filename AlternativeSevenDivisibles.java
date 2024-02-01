class AlternativeSevenDivisibles{
	public static void main(String[] s){
		int cnt = 0;
		int sum = 0;
		for(int i = 7; i < 200; i+=7){
		if(cnt % 2 == 0){
		System.out.println(i);
		sum += i;
		}

		cnt++;
		}
		System.out.println(sum);
	}
}