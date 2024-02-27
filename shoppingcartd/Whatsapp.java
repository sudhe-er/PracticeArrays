package shoppingcartd;

public class Whatsapp {
	public Whatsapp(Order o) {
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("Whatsapp sent for Order ID " + o.getOrderid());
			}
		});
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
