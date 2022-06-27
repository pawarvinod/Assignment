package YashAssignment23Jun;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PringtEvenPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<Integer> even=  Arrays.asList(100,200,400,300,500,600,345,343,654,864);
		  List<Integer> evenPrice= even.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println(evenPrice);

	}

}
