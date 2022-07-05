package Assignment5;

import java.util.List;

//5. WAP to inject n numbers to a bean and find out the maximum out of them using stream 
//operator
public class Assi5 {
	 
	List<Integer> number;

	
	public Assi5(List<Integer> number) {
		super();
		this.number = number;
	}


	void maximum()
	{

		Integer obj = number.stream().max((s1,s2)->s1>s2?1:-1).get();
	 	
 		
		System.out.println(obj);
	}

}
