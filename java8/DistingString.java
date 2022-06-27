package Assignment3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DistingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> slist=Arrays.asList("Vinod", "Akash", "Shubham", "Akshay","Prasad","Vinod","Akash");
		
		List<String> unique= slist.stream().sorted(Comparator.naturalOrder()).distinct().collect(Collectors.toList());

		System.out.println(unique);
	}

}
