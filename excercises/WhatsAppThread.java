package excercises;

public class WhatsAppThread implements Runnable {
    private Order order;

    public WhatsAppThread(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        System.out.println("Sending WhatsApp message for order: " + order.getOrderId());

        System.out.println("WhatsApp: \n"+"\tItem Name\tItem Price");
        for (Item item : order.getItems()) {
            System.out.println("\t"+item.getItemName() + "\t\t\t" + item.getItemPrice());
           
        }
        System.out.println();
    }
    
}