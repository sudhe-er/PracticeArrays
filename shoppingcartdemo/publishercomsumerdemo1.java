package shoppingcartdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class publishercomsumerdemo1 {
	// public String inpuwt;

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello Welcome......\nplease choose a item available list");
		Item1 i = new Item1();
		Order1 o = new Order1();
		System.out.println("enterhere:");
		ArrayList<Item1> in = new ArrayList<>();
		boolean t = true;
		while (t) {
			String input = sc.next();
			if (i.availableItems.containsKey(input)) {
				o.selecteditemList.add(i.availableItems.get(input));

			} else {
				System.out.println("selection completed");
				t = false;
			}

		}
		o.printarr();

	}

}
