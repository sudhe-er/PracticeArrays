import java.util.*;
class NumberCategory{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String res = "";
		boolean flag =  false;
		if(num % 15 == 0){
			res = "SPECIAL";
		}
		else if( num > 999){
			res = "BIG";
			flag = true;
		}
		if( num % 5 == 0 && num % 6 == 0 && num % 18 != 0){
			System.out.println("WIERED");
			flag = true;
		}

		System.out.println(res);
		if(flag){
			System.out.println("SCARY");
		}		
		
	}
}