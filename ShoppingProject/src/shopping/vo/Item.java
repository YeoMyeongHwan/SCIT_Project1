package shopping.vo;

public class Item {
	private String itemNo;
	private String itemName;
	private String price;
	
	public Item() {
	}
	public Item(String itemName, String price) {
		this.itemName = itemName;
		this.price = price;
	}
	public Item(String itemNo, String itemName, String price) {
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.price = price;
	}
	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
