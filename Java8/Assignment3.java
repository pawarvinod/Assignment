package TDDAssignment;

import java.util.Scanner;

public class Assignment3 {
	
	public static boolean chekPassAndEmail()
	{
	String email="vinod@123gamil.com";
	String pass="vinod@321";
	Scanner sc = new Scanner(System.in);
	System.out.println("enter email n pwd");
	String e=sc.next();
	String s=sc.next();
	if(email.equals(e) && pass.equals(s))
	{
		return true;
	}
	return false;
	 
    }
}
