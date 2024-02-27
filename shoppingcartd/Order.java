package shoppingcartd;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private int orderid;
	// private Date date;
	private String orderItem;
	private int itemQuantity;
	private String customerName;
	private double amount;
	private String address;
	List<Item> availableItems = new ArrayList<>();

	public Order(int orderid) {
		// super();
		this.setOrderid(orderid);
		this.setOrderItem("rolexWathc");
		this.itemQuantity = 1;
		this.customerName = "ash";
		this.amount = 100;
		this.address = "jai bharath nagar";

		availableItems.add(new Item(1001, "rolex", "watch", 1000));
		availableItems.add(new Item(1001, "classicbrown fromal Shoes", "mens footware", 500));
		availableItems.add(new Item(1001, "office fromal belt", "mens accessories", 100));
		// availableItems.add(new Item(1001, "formal blueShirt", "mens shirts", 1080));
		// availableItems.add(new Item(1001, "formal blackpant", "mens pants", 1800));
	}

	public String getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public void getOrderDetails() {
		System.out.println("Order ID : " + orderid);
		System.out.println("Order ite,m : " + orderItem);
		System.out.println("Item Quantity : " + itemQuantity);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Amount : " + amount);
		System.out.println("Address : " + address);
		for (Item i : availableItems) {
			System.out.println("Item ID : " + i.getIteamid());
			System.out.println("Item Name : " + i.getIteamName());
			System.out.println("Product Category : " + i.getProductCatagory());
			System.out.println("Item Price : " + i.getIteamPrice());
		}
		System.out.println("\n");
	}

}
