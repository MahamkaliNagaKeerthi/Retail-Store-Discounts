package com.corejava.assignment.metadata;

import com.corejava.assignment.Item;

public class ShoppingMetaData {
	Item[] items=new Item[30];
	public void setShoppingMetaData() {
		Item item=null;
		for(int i=0;i<10;i++) {
			item=new Item("ClothingItem"+i,"Clothing",100+i);
			items[i]=item;
		}
		for(int i=10;i<20;i++) {
			item=new Item("FurnitureItem"+i,"Furniture",200+i);
			items[i]=item;
		}
		for(int i=20;i<30;i++) {
			item=new Item("GroceriesItem"+i,"Groceries",400+i);
			items[i]=item;
		}
	}
	public String[] getItems(String categoryName) {
		String[] itemNames=new String[10];
		int j=0;
		for(int i=0;i<items.length;i++) {			
			if(items[i].getCategory().equalsIgnoreCase(categoryName)) {
				itemNames[j]=this.items[i].getItemName();
				j++;
			}
			
		}
		return itemNames;
	}
	public Item[] getItems() {
		return items;
	}
	
}
