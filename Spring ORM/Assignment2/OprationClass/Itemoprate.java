package com.yash.oprate;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.CustermerDao;
import com.yash.dao.ItemDao;
import com.yash.model.Customer;
import com.yash.model.Item;

public class Itemoprate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		========insert infpormation of item class here
		
		ApplicationContext app= new ClassPathXmlApplicationContext("applicationcontext.xml");
		ItemDao id= (ItemDao) app.getBean("idao");
		Scanner sc= new Scanner(System.in);
		Item i=new Item();
//		System.out.println("Enter item id");
//		i.setItemid(sc.nextInt());
//		System.out.println("Enter item name");
//		i.setIname(sc.next());
//		System.out.println("Enter cat id ");
//		i.setSubcatid(sc.nextInt());
//		System.out.println("Enter item price");
//		i.setPrice(sc.nextInt());
//		System.out.println("enter  manufacturing date");
//		String st=sc.next();
//		Date date=Date.valueOf(st);
//		i.setDom(date);
//		System.out.println("enter expiry date");
//		String s=sc.next();
//		Date d=Date.valueOf(s);
//		i.setDoe(d);
//		System.out.println("Enter  item stcok here");
//		i.setInstock(sc.next());
//		System.out.println("Enter item discount");
//		i.setDiscount(sc.nextInt());
//		
	
//		id.intseritem(i);
		//total number of item in each subcategory.
//		System.out.println("         total number of item in each subcategory.");
		List<Item> itemlist=id.getItem();	
//		for(Item it:itemlist)
//		{
//			int id1=it.getItemid();
//			int count=0;
//			if(it.getSubcatid()==52)
//			{
//				count++;
//		
//				System.out.println("Number of item "+count+" item id : "+it.getItemid()+" item name: "+it.getIname()+" sub category : "+it.getSubcatid()+" item discount : "+it.getDiscount()+"%");		
//			}
//			
//		}
//		==========total number of item which are out of stock   ==============
		System.out.println("    Total number of item which are out of stock");
//		for (Item item : itemlist) 
//		{
////			System.out.println(item.getInstock());
//			if(item.getInstock().equals("no"))
//			{
////				System.out.println(item.getInstock());
//				System.out.println("item name : "+item.getIname()+" item price : "+item.getPrice());
//			}
//		}
//		List<Item> getitemOutOfstock = id.getitemOutOfstock();
//		
//		int count=0;
		System.out.println("");
//		for (Item item : getitemOutOfstock) 
//		{
//			count++;
//			System.out.println("     item name : "+item.getIname()+" item price : "+item.getPrice());
//			
//		}
//		System.out.println("     number of item  out of stock : "+count);
//
//	//============ Details of item which are having highest discount ====================
//	
//	List<Item> dis = id.getHightDiscount();
//
//	System.out.println("  Details of item which are having highest discount");
//	for (Item item : dis) 
//	{
////		count++;
//		System.out.println("item id : "+item.getItemid()+"  item name : "+item.getIname()+" item price : "+item.getPrice()+" discsount:"+item.getDiscount());
//		
//	}
//	
//	
//	//==========details of items which are having lowest selling ===========
//	
//	List<Item> sell = id.getLowestSelling();
//
//	System.out.println(" details of items which are having lowest selling");
//	for (Item item : sell) 
//	{
//		
//		System.out.println("item id : "+item.getItemid()+"  item name : "+item.getIname()+" item price : "+item.getPrice()+" discsount:"+item.getDiscount());
//		
//	}
//	//====details of those customer whose billing is more than average billing==
//	
//	
//	
//	
	 CustermerDao cdao=	(CustermerDao) app.getBean("ctmerbean");
//	    Customer ctm= new Customer();
//        System.out.println("=====details of those customer whose billing is more than average billing=======");
//	    List<Customer> ct=  cdao .getmorethanAvgBill();
//	    for (Customer cust : ct)
//	    {
//			System.out.println("Custmer id : "+cust.getCustomerid()+"  custmer name : "+cust.getCustomername());
//		}
//	
     
	//======== details of those items which are purchased in given date range===========	
	List<Customer> cu=cdao.getPurchaseDate();
	System.out.println("====== details of those items which are purchased in given date range=======");
	for (Customer cus : cu)
	{
		
			System.out.println(" cunstmer id : "+cus.getCustomerid()+",  custmer name :"+cus.getCustomername()+"y custmer address : "+cus.getAdd2()+", date of purchase : "+cus.getDob());
		
	}
	}
}