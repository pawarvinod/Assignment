package Assignment15;

import java.time.LocalDate;

public class ItemAss15 {
	int itemId;
	String itemName;
	int costPrice;
	int sellPrice;
	LocalDate dom;
	LocalDate doe;
	
	
	public int getItemId()
	{
		
		return itemId;
	}
	public boolean setItemId(int itemId) 
	{
//		int itemId;
		int cnt=0;
		while(itemId>0)
		{
			cnt++;
			itemId=itemId/10;
		}
		if(cnt>=3)
		{
		this.itemId = itemId;
		return true;
	    }
		else
		{
			System.out.println("id should grather than 3");
		}
		return false;
	}
	public String getItemName() {
		return itemName;
	}
	public boolean setItemName(String itemName)
	{
		int cnt=0;
		for (int i = 0; i < itemName.length(); i++) 
		{
			if(itemName.charAt(i)>='A' && itemName.charAt(i)<='Z' || itemName.charAt(i)>='a' && itemName.charAt(i)<='z')
			{
			cnt++;
			}
		}
		if(cnt==itemName.length())
		{
			this.itemName = itemName;	
		return true;
		}
		else
		{
			System.out.println("Only char accepted");
		}
		return false;
	
	}
	public int getCostPrice() {
		return costPrice;
	}
	public boolean setCostPrice(int costPrice) 
	{
		if(costPrice>0)
		{
		this.costPrice = costPrice;
		return true;
		}
		else
		{
			System.out.println("cost can not negative");
		}
		return false;
	}
	public int getSellPrice() {
		return sellPrice;
	}
	public boolean setSellPrice(int sellPrice) 
	{
		if(costPrice!=sellPrice)
		{
		this.sellPrice = sellPrice;
		return true;
		}
		else
		{
			System.out.println("sell price and cost price not be same");
		}
		return false;
	}
	public LocalDate getDom() {
		return dom;
	}
	public boolean setDom(LocalDate dom)
	{
		if(dom==LocalDate.now())
		this.dom = dom;
		return true;
	}
	public LocalDate getDoe() {
		return doe;
	}
	public boolean setDoe(LocalDate doe)
	{
		if(doe!=LocalDate.now())
		{
		this.doe = doe;
		return true;
		}
		else
		{
			System.out.println(" date of expiring can not be today,");
		}
		return false;
	}
	
	
	

}
