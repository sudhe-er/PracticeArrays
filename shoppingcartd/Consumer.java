
package shoppingcartd;

public class Consumer extends Thread {
	Order obj = null;

	public Consumer(Order o) {
		obj = o;
	}

	public synchronized void run() {
		Mail m = new Mail(obj);
		obj.getOrderDetails();
		Whatsapp w = new Whatsapp(obj);
		obj.getOrderDetails();
	}
}
