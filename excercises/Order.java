package excercises;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Order {
    private int orderId;
    private String orderDate;
    private double orderTotal;
    private List<Item> items;
    private List<Item> randomItems;
    
    public Order() {
    	this.items = new ArrayList<>();
    	items.add(new Item(1999, "T-Shirts", 789.7, 2));
        items.add(new Item(8769, "Denim", 549, 1));
        items.add(new Item(1098, "Jeans", 675.9, 3));
        items.add(new Item(2313, "Trousers", 987.7, 1));
        items.add(new Item(1999, "Boxers", 789.7, 2));
        items.add(new Item(1999, "T-Shirts", 789.7, 2));
        items.add(new Item(1234, "Oxo", 1000, 6));
        items.add(new Item(9081, "Casuals", 500, 1));
    }

    public Order(int orderId, String orderDate) {
    	this();
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderTotal = 0.0; 
        
        this.randomItems = new ArrayList<>();
        
        Random random = new Random ();
        for(int i = 1; i <= random.nextInt(9); i++) {
        	randomItems.add(items.get(i));
        }
        
        
        
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void addItem(Item item) {
        items.add(item);
        orderTotal += item.getItemPrice() * item.getItemQuantity();
    }

    public void removeItem(Item item) {
        items.remove(item);
        orderTotal -= item.getItemPrice() * item.getItemQuantity();
    }

    public List<Item> getItems() {
        return randomItems;
    }
}
