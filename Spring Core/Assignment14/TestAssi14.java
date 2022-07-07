package Assignment14;

import java.util.Scanner;

public class TestAssi14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Circle c= new Circle();
		Rectangle r= new Rectangle();
		Sqare s= new Sqare();
		System.out.println("enter your object");
		String obj=sc.next();
		if(obj.equals("c"))
		{
			c.area(10);
		}
		else
		{
			System.out.println("plz enter valid object");
		}
		 if(obj.equals("r"))
		{
			r.side(10, 20);
		}
		 else
		 {
			 System.out.println("plz enter valid object");
		 }
		

	}

}
