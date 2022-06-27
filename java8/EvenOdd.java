package Assignment9;

import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenOdd {
	public static void main(String[] args) {
		
		IntPredicate isOdd=arg->arg%2==1;
		System.out.println("Enter your value");
		Scanner sc  =new Scanner(System.in);
		int a=sc.nextInt();
		
		System.out.println(isOdd.test(a));
		
		
		IntStream str=IntStream.range(1, 10);
		List<Integer> oddNumber = str.filter(isOdd).boxed().collect(Collectors.toList());
		System.out.println(oddNumber);
		
		IntPredicate iseven=arg->arg%2==0;
		
		
		System.out.println(iseven.test(a));
	}

}
