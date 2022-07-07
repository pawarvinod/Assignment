package Assignment15;
	//
	//WAP in which three beans need to be created item, category and customer. Category 
	//injected in item and item injected in customer. Now print all item purchased by customer.
public class Assi15Item 
{
	String itemName;
	int itemid;
	int itemPrice;
	Category cat;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Category getCat() {
		return cat;
	}
	public void setCat(Category cat) {
		this.cat = cat;
	}
	public void showCategoary()
	{
		System.out.println("Categary name : "+cat.catName);
	}
}
