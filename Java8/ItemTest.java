package Assignment15;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class ItemTest15 {
	
	Scanner sc = new Scanner(System.in);
	ItemAss15 it=new ItemAss15();
	
	@Test
	void idTest() 
	{
		
		System.out.println("Enter your item Id");
		int id=sc.nextInt();
		assertEquals(true, it.setItemId(id));
		
	}

	@Test
	void nameTest() 
	{
		System.out.println("Enter your item name");
		String name=sc.next();
		
		assertEquals(true,it.setItemName(name));
		
	}
	@Test
	void costPriceTest() 
	{
		System.out.println("Enter your cost price");
		int cost=sc.nextInt();
		assertEquals(true, it.setCostPrice(cost));
		
	}
	@Test
	void sellPriceTest() 
	{
		System.out.println("Enter your sell price");
		int sell=sc.nextInt();
		assertEquals(true, it.setSellPrice(sell));
		
	}
	@Test
	void domTest() 
	{
		System.out.println("Enter your date of  manufacuring");
		String DATE_FORMATERS="yyy,mm,dd";
		DateTimeFormatter format= DateTimeFormatter.ofPattern(DATE_FORMATERS);
		String frmat=sc.nextLine();
		LocalDate ld=  LocalDate.parse(frmat);
		assertEquals(true, it.setDom(ld));
		
	}
	@Test
	void doeTest() 
	{
		System.out.println("Enter your date of  expiry");
		String DATE_FORMATERS="yyy,mm,dd";
		DateTimeFormatter format= DateTimeFormatter.ofPattern(DATE_FORMATERS);
		String frmat=sc.nextLine();
		LocalDate ld=  LocalDate.parse(frmat);
		assertEquals(true, it.setDoe(ld) );
		
	}
	
	
	
	
}
