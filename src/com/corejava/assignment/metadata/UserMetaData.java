package com.corejava.assignment.metadata;

import com.corejava.assignment.User;

public class UserMetaData {
	User[] storeUsers = new User[50];
	User[] storeAffliatedUsers = new User[50];
	User[] twoYearsOldUsers = new User[50];
	User user = null;

	public void setMetaData() {
		for (int i = 0; i < 50; i++) {
			storeUsers[i] = new User("User" + i, "994988660" + i);
		}
		for (int i = 0; i < 50; i++) {
			storeAffliatedUsers[i] = new User("User" + i, "994988550" + i);
		}
		for (int i = 0; i < 50; i++) {
			twoYearsOldUsers[i] = new User("User" + i, "994988770" + i);
		}

	}

	public User[] getStoreUsers() {
		return storeUsers;
	}

	public User[] getStoreAffliatedUsers() {
		return storeAffliatedUsers;
	}

	public User[] getTwoYearsOldUsers() {
		return twoYearsOldUsers;
	}
}
