package TDDAssignment;

public class Assignment8 {

//		int a[]= {23,45,765,34,23,24,46};
		public static boolean checkEvenOdd()
		{
			
		int a[]= {23,45,765,34,23,24,46};
		for (int i = 0; i < a.length; i++) 
		 {
		if(i%2==0)
		{
			return true;
		 }
	     }
		return false;
	  
		}
}
