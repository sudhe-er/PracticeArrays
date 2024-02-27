package excercises;

public class EmailThread implements Runnable {
    private Order order;

    public EmailThread(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        System.out.println("Sending email for order: " + order.getOrderId());
        // Print item details for email
        System.out.println("Email: \n"+"\tItem Name\tItem Price");
        for (Item item : order.getItems()) {
            System.out.println("\t" + item.getItemName() + "\t\t\t" + item.getItemPrice());
            
        }
        System.out.println();
    }
}
