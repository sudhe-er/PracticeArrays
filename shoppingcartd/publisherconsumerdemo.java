package shoppingcartd;

import java.util.Scanner;

public class publisherconsumerdemo {

	public static void main(String args[]) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("enter");
			int id = sc.nextInt();
			Producer p = new Producer(id);
			p.start();
			p.join();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
