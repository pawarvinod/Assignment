package Assignment11;

import java.util.stream.IntStream;

public class FindParllal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Normal");
		IntStream range=IntStream.rangeClosed(1, 10);
		range.forEach(System.out::println);
		
		System.out.println("paraller");
		
		IntStream ra2=IntStream.rangeClosed(1,10);
		ra2.parallel().forEach(System.out::println);

	}

}
