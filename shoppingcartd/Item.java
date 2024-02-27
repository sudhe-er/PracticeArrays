package shoppingcartd;

public class Item {
	private int iteamid;
	private String iteamName;
	private String productCatagory;
	private int iteamPrice;

	public int getIteamid() {
		return iteamid;
	}

	public void setIteamid(int iteamid) {
		this.iteamid = iteamid;
	}

	public String getIteamName() {
		return iteamName;
	}

	public void setIteamName(String iteamName) {
		this.iteamName = iteamName;
	}

	public String getProductCatagory() {
		return productCatagory;
	}

	public void setProductCatagory(String productCatagory) {
		this.productCatagory = productCatagory;
	}

	public int getIteamPrice() {
		return iteamPrice;
	}

	public void setIteamPrice(int iteamPrice) {
		this.iteamPrice = iteamPrice;
	}

	public Item(int iteamid, String iteamName, String productCatagory, int iteamPrice) {

		this.iteamid = iteamid;
		this.iteamName = iteamName;
		this.productCatagory = productCatagory;
		this.iteamPrice = iteamPrice;
	}

	public Item() {
		// TODO Auto-generated constructor stub
		this.iteamid = 0;
		this.iteamName = "";
		this.productCatagory = "";
		this.iteamPrice = 0;
	}

	@Override
	public String toString() {
		return "Items [iteamid=" + iteamid + ", iteamName=" + iteamName + ", productCatagory=" + productCatagory
				+ ", iteamPrice=" + iteamPrice + "]";
	}

}
