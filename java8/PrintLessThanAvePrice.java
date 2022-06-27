package YashAssignment23Jun;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintLessThanAvePrice {
	public static void main(String[] args) {
		
		List<Integer> less=Arrays.asList(52,35,76,86,34);
		Double  avg= less.stream().collect(Collectors.averagingInt(s1->s1));
	
		System.out.println(avg);
	}

}
