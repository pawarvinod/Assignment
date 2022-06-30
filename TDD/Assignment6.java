package TDDAssignment;

import java.util.Scanner;

public class Assignment6 {

	public static int countVowels() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string for check voweles");
		String s=sc.next();
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				count++;
			}
			else if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
			{
				count++;
			}
		}
		
		return count;
	}

}
