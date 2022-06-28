package YashAssignment23Jun;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestUniquEmplyee {
	public static void main(String[] args) {
		List<Emplyooee10> ue=new ArrayList<Emplyooee10>();
		ue.add(new Emplyooee10("Vinod", 24, 23475));
		ue.add(new Emplyooee10("akash", 26, 23475));
		ue.add(new Emplyooee10("shubham", 25, 23475));
		ue.add(new Emplyooee10("prasad", 22, 23475));
		ue.add(new Emplyooee10("akshay", 24, 23475));
		ue.add(new Emplyooee10("rakesh", 28, 23475));
		
		// Convert into array list
		List<String> li=new ArrayList<String>();
		for(Emplyooee10 em:ue)
		{
			li.add(em.getName());
		}
		
	List<String>	maplist=  ue.stream().map(em->em.getName()).collect(Collectors.toList());
	System.out.println(maplist);
	}

}
