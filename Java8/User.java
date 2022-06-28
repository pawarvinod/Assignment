package Assignment16;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class User {
	
	String itemName;
	String catagory;
	double price;
	LocalDate dom;
	LocalDate doe;
	public User(String itemName, String catagory, double price, LocalDate dom, LocalDate doe) {
		super();
		this.itemName = itemName;
		this.catagory = catagory;
		this.price = price;
		this.dom = dom;
		this.doe = doe;
	}
	
	
	
	
}
 class  UserTest
 {
	 public static void main(String[] args) {
		List<User> item= new LinkedList<User>();
		item.add(new User("shirt", "cloth", 800, LocalDate.of(2022, 05, 24), LocalDate.of(2022, 10, 10)));
		item.add(new User("apple", "fruit", 200, LocalDate.of(2022, 05, 15), LocalDate.of(2022, 05, 30)));
		item.add(new User("washing machine", "electrical", 15000, LocalDate.of(2022, 01, 24), LocalDate.of(2022, 03, 22)));
		item.add(new User("dog", "animal", 5000, LocalDate.of(2022, 06, 15), LocalDate.of(2022, 06, 30)));
		item.add(new User("laptop", "electrical", 800, LocalDate.of(2022, 07, 10), LocalDate.of(2022, 07, 25)));
		
		
		//
		System.out.println("Enter your catagoary");
		Scanner sc = new Scanner(System.in);
	    String cat=sc.next();
	   List<User> itemlist= item.stream().filter(e->e.catagory.equals(cat)).collect(Collectors.toList());
	    for(User list:itemlist)
	    {
	    	System.out.println("Item Name is :"+list.itemName+" Catagoary Name is :"+list.catagory+" Item Manufacuring date :"+list.dom);
	    }
	    
	    
	    
	    //Start with first letter
	    System.out.println("Enter your first letter of item name");
		String start=sc.next();
		  List<User> startWith=   item.stream().filter(e->e.itemName.startsWith(start.toLowerCase())).collect(Collectors.toList());
		for(User li:startWith)
		{
			System.out.println("Item Name is :"+li.itemName+" Catagoary Name is :"+li.catagory+" Item Manufacuring date :"+li.dom);
		}
		
		
		//print date with
		 System.out.println("Enter your date");
			String DATE_FORMATERS="yyy,mm,dd";
			DateTimeFormatter format= DateTimeFormatter.ofPattern(DATE_FORMATERS);
			String frmat=sc.nextLine();
			  LocalDate ld=  LocalDate.parse(frmat);
			
			      List<User> date=   item.stream().filter(e->e.dom.compareTo(ld)==0).collect(Collectors.toList());   
			for(User td:date)
			{
				System.out.println("Item Name is :"+td.itemName+" Catagoary Name is :"+td.catagory+" Item Manufacuring date :"+td.dom);
			}
	}
 }
