package com.corejava.assignment;

public class Item {
	String itemName;
	String category;
	long price;
	public Item(String itemName, String category, long price) {
		super();
		this.itemName = itemName;
		this.category = category;
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}
	public String getCategory() {
		return category;
	}
	public long getPrice() {
		return price;
	}
	
}
