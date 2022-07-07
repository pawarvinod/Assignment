package Assignment10;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//WAP to inject student name and marks into spring bean and you have to use hashmap. Use 
	//key as student name and marks as value. And sort all the data and print the records. For 
	//example you can inject map in following way.
	//<map> 
	//<entry key-ref="sunil" value-ref="350"></entry> 
	//<entry key-ref="anil" value-ref="401"></entry> 
	//</map>

public class Assi10 
{
	HashMap< String, Integer> m1=new HashMap<String, Integer>();

	
	
	public Assi10(HashMap<String, Integer> m1) 
	{
		super();
		this.m1 = m1;
	}



//	public void sorted()
//	{
//		System.out.println("sorted");
//		List<String> sort1= new ArrayList<String>(m1.keySet());
//		ArrayList<String> sort= new ArrayList<String>(m1.keySet());
//		 Collections.sort(sort);
//	        for (String v : sort)
//	            System.out.println("Name = " + v));
//	            
//	            
//	            
//	}
//
//

	public void issorted() {
		// TODO Auto-generated method stub
		System.out.println("Sorted list based on name:-----");
        ArrayList<String> sortKeys= new ArrayList<String>(m1.keySet());
         Collections.sort(sortKeys);
            for (String x : sortKeys)
                System.out.println("Name = " + x + ", Marks = " + m1.get(x));
	}

	
}
