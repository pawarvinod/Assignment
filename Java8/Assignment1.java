package TDDAssignment;

import java.util.Scanner;

public class Assignment1 {


//	public static void main(String[] args)//12 2,3,4,6 16-2,4,8 2,4 4
//	{
//		System.out.println(Assignment1.number());
//	}
	
	public static int number()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your number 1");	
		int a=sc.nextInt();
		int b= sc.nextInt();
		int temp=0;
		for (int i = 1; i <a || i<b; i++)
		{
		
			if(a%i==0 && b%i==0)
			{
				temp=i; 
			}
		}
		
	 return temp;	
	}
}
