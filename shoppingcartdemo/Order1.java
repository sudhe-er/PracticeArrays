package shoppingcartdemo;

import java.util.ArrayList;

public class Order1 {
	ArrayList<Item1> selecteditemList = new ArrayList<>();

	public void printarr() {
		for (Item1 i : selecteditemList) {
			System.out.println(i);
		}
	}

}
