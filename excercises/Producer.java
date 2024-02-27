package excercises;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Producer implements Runnable {
    private Shopper shopper;

    public Producer(Shopper shopper) {
        this.shopper = shopper;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            //
            Queue<Integer>q = new LinkedList<>();
            System.out.println("How many Orders you want to place?");
            int size = scanner.nextInt();
            int orderId;
            while(size-- > 0) {
                System.out.print("Enter order ID for order: ");
            	orderId = scanner.nextInt();
            	q.add(orderId);
            }
            
            while(!q.isEmpty()) {
            	Order order = new Order(q.poll(), "2024-02-27");
            	shopper.placeOrder(order);
                System.out.println("Producer placed order: " + order.getOrderId());
            }
            System.out.println();
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //scanner.close();
        }
        
       
    }
}
