package excercises;


public class Consumer implements Runnable {
    private Shopper shopper;

    public Consumer(Shopper shopper) {
        this.shopper = shopper;
    }

    @Override
    public void run() {
    	
        while (true) {
            Order order = shopper.getOrder();
            System.out.println("Consumer received order: " + order.getOrderId());
            System.out.println();

            
            Thread emailThread = new Thread(new EmailThread(order));
            emailThread.start();
            try {
            	emailThread.join();
            } catch (InterruptedException ie) {
            	ie.printStackTrace();
            }

            Thread whatsappThread = new Thread(new WhatsAppThread(order));
            whatsappThread.start();

            try {
            	Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }

   
}

