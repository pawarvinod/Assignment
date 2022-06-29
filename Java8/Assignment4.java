package TDDAssignment;

import java.util.Scanner;

public class Assignment4 {
	
		
		public static boolean amstromg(int num, int data, int temp, int res)
		{
			
		
		while(data!=0)
		{
			temp=data%10;
			res=res+temp*temp*temp;
			data/=10;
		}
		if(num==res)
		{	
			return true;
		}
		else
		{
			
			return false;
		}
	}
}