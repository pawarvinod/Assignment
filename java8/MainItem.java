package Assignment6;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MainItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Item> item=new LinkedList<Item>();
		item.add(new Item(11, "panipuri", 20f));
		item.add(new Item(11, "bhelpuri", 15f));
		item.add(new Item(11, "paratha", 40f));
		item.add(new Item(11, "samosa", 15f));
		item.add(new Item(11, "patis", 25f));
		item.add(new Item(11, "jamun", 20f));
		item.add(new Item(11, "idli", 30f));
		item.add(new Item(11, "sambar vada", 35f));
		item.add(new Item(11, "dhosa", 50f));
		Double avg=   item.stream().collect(Collectors.averagingDouble(s1->s1.itemprice));
		System.out.println(avg);
		 List<Float> list= item.stream().filter(s->s.itemprice>=avg).map(s->s.itemprice).collect(Collectors.toList());

		 System.out.println(list);
	}

}
