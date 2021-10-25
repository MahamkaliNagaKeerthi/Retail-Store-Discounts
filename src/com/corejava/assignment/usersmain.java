package com.corejava.assignment;

import java.util.Scanner;

import com.corejava.assignment.metadata.ShoppingMetaData;
import com.corejava.assignment.metadata.UserMetaData;

public class usersmain {
	static Scanner scanner = new Scanner(System.in);
	static UserMetaData userMetadata = new UserMetaData();
	static ShoppingMetaData shoppingMetaData = new ShoppingMetaData();

	public static void main(String[] args) {
		String itemNames[] = new String[50];
		userMetadata.setMetaData();
		shoppingMetaData.setShoppingMetaData();
		
		// Reading the mobile no
		System.out.println("Please enter your mobile No:");
		String mobileNo = scanner.nextLine();
		System.out.println("Entered mobile no is :" + mobileNo);
		String categoryName=showItemsList();
		String itemNameEntered = scanner.next();
		itemNames[(itemNames.length) - 1] = itemNameEntered;
		System.out.println(itemNameEntered + " is added to the cart");
		System.out.println("Your bill is "+doBilling(mobileNo, itemNameEntered, categoryName));

	}

	public static double doBilling(String mobileNo,String itemNameEntered,String categoryName) {
		long percentage=0;
		double itemPrice=0;
		Item[] items=shoppingMetaData.getItems();
		for(Item item:shoppingMetaData.getItems()) {
			if(item.getItemName().equalsIgnoreCase(itemNameEntered)) {
				itemPrice=item.getPrice();
				if(categoryName.equalsIgnoreCase("Groceries")) {
					return itemPrice;
				}
			}
		}
		for(User user:userMetadata.getStoreUsers()) {
			if(user.getPhonenumber().equalsIgnoreCase(mobileNo)) {
				percentage=30;
				System.out.println("You got 30% discount of the actual price");
				return itemPrice-(percentage/100.0)*itemPrice;
			}
		}
		for(User user:userMetadata.getStoreAffliatedUsers()) {
			if(user.getPhonenumber().equalsIgnoreCase(mobileNo)) {
				percentage=10;
				System.out.println("You got 10% discount of the actual price");
				System.out.println("You got 10% discount of the actual price"+itemPrice);
				return itemPrice-(percentage/100.0)*itemPrice;
			}
		}
		for(User user:userMetadata.getTwoYearsOldUsers()) {
			if(user.getPhonenumber().equalsIgnoreCase(mobileNo)) {
				percentage=5;
				System.out.println("You got 5% discount of the actual price");
				System.out.println("You got 5% discount of the actual price"+itemPrice);
				return itemPrice-(percentage/100.0)*itemPrice;
			}
		}
		if(percentage==0 && itemPrice==0) {
			System.out.println("You have not choosen the item from the available items");
		}else {
			System.out.println("You got 5 $ discount on spent of evrey 100");
			return itemPrice-((itemPrice/100.0)*5);
		}
		return 0;
		
		
	}

	public static String showItemsList() {
		// Reading the shopping items from the list
		System.out.println(
				"Please choose the category number from the below list to show the available items to purchase :\n1.Clothing\n2.Furniture\n3.Groceries");
		int categoryNo = scanner.nextInt();
		String categoryName = "";
		if (categoryNo == 1) {
			categoryName = "Clothing";
		} else if (categoryNo == 2) {
			categoryName = "Furniture";
		} else {
			categoryName = "Groceries";
		}
		System.out.println("Please choose the items from the below list by entering the item name same as it is");
		for (String itemName : shoppingMetaData.getItems(categoryName)) {
			System.out.println(itemName);
		}
		return categoryName;
	}

}
