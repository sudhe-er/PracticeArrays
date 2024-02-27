package shoppingcartdemo;

import java.util.HashMap;

public class Item1 {
	private int itemid;
	private String itemName;
	private double itemPrice;
	public HashMap<String, Item1> availableItems = new HashMap<>();

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Item1(int itemid, String itemName, double itemPrice) {
		this.itemid = itemid;
		this.itemName = itemName;
		this.itemPrice = itemPrice;

	}

	public Item1() {
		getavailableItems();

	}

	public void getavailableItems() {

		// availableList.put("", )
		availableItems.put("RolexWatch", new Item1(1001, "rolex", 1000));
		availableItems.put("foramlShoes", new Item1(1001, "classicbrown fromal Shoes", 500));
		availableItems.put("formalbelt", new Item1(1001, "office fromal belt", 100));
		availableItems.put("blueShirt", new Item1(1001, "formal blueShirt", 1080));
		availableItems.put("blackPant", new Item1(1001, "formal blackpant", 1800));
		System.out.println("Available list");
		for (String s : availableItems.keySet()) {
			System.out.println(s);
		}

	}

}
