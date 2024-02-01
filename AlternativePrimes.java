class AlternativePrimes{
	public static void main(String[] a){
		int cnt = 0;
		for(int i = 100; i > 1; i-= 1){
			if(isPrime(i)){
				if(cnt % 2 == 0)
					System.out.println(i);
				cnt++;
			}
		}
	}
	static boolean isPrime(int num){
		
		if(num == 2 || num == 3)
			return true;
		for(int i = 2; i <= Math.sqrt(num); i++){
			if(num % i == 0)
				return false;
		}
		return true;
	}
}