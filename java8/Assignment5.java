import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String []s={"vinod", "shubham","bhupeshqw","akash"};
		  List<Integer> list1= new ArrayList<>();
		
		 for(String i: s)
		 {
			 int count=0;
			char[]ch=i.toCharArray();
			
			for( char v:ch)
			{
				count++;
			}
			list1.add(count);
		 }

		Integer maximum1= list1.stream().max((e1,e2)->e1.intValue()>e2.intValue()?1:-1).get();
		 int in=list1.indexOf(maximum1);
		 System.out.println(s[in]);
		 System.out.println(maximum1);
	}

}
