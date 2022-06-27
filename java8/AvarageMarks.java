package YashAssignment23Jun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AvarageMarks {
	public static void main(String[] args) 
	 {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your length");
		int a=sc.nextInt();
		System.out.println("Enter your values");
		List<Integer> li=new ArrayList<>();
		for (int i = 0; i <a; i++) {
			li.add(sc.nextInt());
		}
		System.out.println(li);
	Double avg=	li.stream().collect(Collectors.averagingInt(s1->s1));
	System.out.println("Your Avarage is : "+avg);
		
	}

}
