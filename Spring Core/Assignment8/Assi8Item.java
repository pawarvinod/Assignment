package Assignment8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// 8. WAP inject list of i
//tem to bean and after this arrange all of the, item name in ascending and 
//descending order. Also remove any duplicate name of item if present.
public class Assi8Item {
	List<String> itemlist;

	public Assi8Item(List<String> itemlist) {
		super();
		this.itemlist = itemlist;
	}



	void ascending()
	{
		List<Object> asc = itemlist.stream().sorted().collect(Collectors.toList());
	System.out.println("Ascending oder : "+asc);
	}
	void decending()
	{
	 List<String>  ittemset=  itemlist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	 System.out.println("decending ordr : "+ittemset);
	}

}
