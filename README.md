# Retail-Store-Discounts
#User Class
It represents the User/Customer for the retail store

#Iteam Class
It represents the Item which is purchased by User/Customer

#ShoppingMetaData.java
It fills the metadata which has all the items in the store under different category

#UserMetaData.java
It fills the metadata which has all the customers data under different categories like storeEmployee,affliatedCustomers,2yearsoldCustomers.

#Implementation
For every organization must maintain database for storing and running the software,but here we dont have connection with 
Database so we need to create a user and items data which acts as metadata.

User can be identified by mobile no which acts as a unique key to avail the discounts

Under items we have 3 categories and which are
Clothing
Furniture
Groceries

Execution
1. User has to enter mobile no to identify and  selects the category to show the available items under it.
2. Once above step is done,program identifies the user belongs to which category by iterating through userMetadata and same applies to shoppingMetaData.
3. If at all user selects the groceries then returning the item price as it is.
4. All other constrains apply as per requirement
