package TDDAssignment;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] furits = {"apple", "orange","banana","lemon"}; // output  => apple-orange-banana-lemon.
	   String s1="";
		for (int i = 0; i < furits.length; i++) 
		{
			if(i==furits.length)
			{
				s1=s1+furits[i];
			}
			else
			{
			s1=s1+furits[i]+"-";	
			}
		System.out.print(s1);
	}

}
}