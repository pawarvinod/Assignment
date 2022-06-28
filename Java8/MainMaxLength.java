package YashAssignment23Jun;

import java.util.ArrayList;
import java.util.List;

public class MainMaxLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<MaximumNumberMaxiLength> maxlength=new ArrayList<>();
		maxlength.add(new MaximumNumberMaxiLength(78, "vinod"));
		maxlength.add(new MaximumNumberMaxiLength(33, "Akash"));
		maxlength.add(new MaximumNumberMaxiLength(88, "shubham"));
		maxlength.add(new MaximumNumberMaxiLength(69, "rakesh"));
		maxlength.add(new MaximumNumberMaxiLength(98, "akshay"));
		maxlength.add(new MaximumNumberMaxiLength(65, "prashad"));
		maxlength.add(new MaximumNumberMaxiLength(48, "hemant"));
		
		MaximumNumberMaxiLength obj1 = maxlength.stream().max((s1,s2)->s1.max>s2.max?1:-1).get();
 		System.out.println("Max Length  : "+obj1.max);
 		
 		
// 		MaximumNumberMaxiLength obj1 = maxlength.stream().le

	}

}
