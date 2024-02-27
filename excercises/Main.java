package excercises;

public class Main {
    public static void main(String[] args) {
        
        Shopper shopper = new Shopper();

        
        Producer producer = new Producer(shopper);
        Thread producerThread = new Thread(producer);
        producerThread.start();

        
        Consumer consumer = new Consumer(shopper);
        Thread consumerThread = new Thread(consumer);
        consumerThread.start();
        
        
    }
}

