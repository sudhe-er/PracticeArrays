package shoppingcartd;

import java.util.Queue;

public class Producer extends Thread {
	private int id;

	public Queue<Order> produceQueue;

	public Producer(int id) {
		this.id = id;

	}

	public void run() {
		Order o = new Order(id);
		Shopper sh = new Shopper();
		sh.shopperqueue.add(o);
		Consumer c = new Consumer(o);
		c.start();
	}

}
