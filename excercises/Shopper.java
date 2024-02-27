package excercises;

import java.util.Queue;
import java.util.LinkedList;

public class Shopper {
    private Queue<Order> queue;

    public Shopper() {
        this.queue = new LinkedList<>();
    }

    public synchronized void placeOrder(Order order) {
        queue.add(order);
        notify(); 
    }

    
    public synchronized Order getOrder() {
        while (queue.isEmpty()) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return queue.poll();
    }
}

