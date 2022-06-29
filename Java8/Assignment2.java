package TDDAssignment;

import java.util.Scanner;

public class Assignment2
{
	public static boolean paliNumber() 
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int temp=a;
		int data=0;
		int res=0;
		while(temp>0)
		{
			data=temp%10;
			res=res*10+data;
			temp/=10;
		}
			
		if(a==res)
		{
			return true;
		}
		
		return false;
	}

}
