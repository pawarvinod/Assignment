package YashAssignment23Jun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistintMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		
//	List< Integer> marks=new ArrayList<Integer>();
//	marks.add(66);
//	marks.add(44);
//	marks.add(88);
//	marks.add(66);
		Collection<Integer> marks=Arrays.asList(66,66,44,33,44,33,55,22,55,23,22,76,66,66,44,44,44,33,33);
	
   List<Integer> dist=  marks.stream().distinct().collect(Collectors.toList());
   System.out.println("Unic Element : "+ dist);
   
 
   
	}
}
