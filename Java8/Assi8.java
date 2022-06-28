package Assignment8;

import java.util.Scanner;
import java.util.function.Predicate;

public class Assi8 {
	
		
	
	public static boolean check(int data)
	{
		Predicate<Integer> pridi=e->(e%2==0);
		return pridi.test(data);
	}
	public static void main(String[] args) {
		while(true) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your input");
		int data=sc.nextInt();
		if(Assi8.check(data)==true)
		{
			System.out.println(data+" :Number is even");
		}
		else
		{
			System.out.println(data+" :Number is odd");
		}
	}

}
}
