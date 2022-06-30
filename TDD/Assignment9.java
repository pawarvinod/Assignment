package TDDAssignment;

public class Assignment9 {

	public static String remospace() {
		String s="This @ Red $car-.";
		String res="";
		String s1="";
		String s2="";
		int a=0;
		for (int i = 0; i < s.length()-1; i++) 
		{
			if(i==0 && s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				s1=s1+s.charAt(i);
			}
			if(s.charAt(i)==' ' && s.charAt(i+1)>='A' && s.charAt(i+1)<='Z')
			{
				a=i+1;
				char c= s.charAt(i+1);
				c=(char) (c+32);
				s1=s1+c;
				
			}
			else if((a!=i && s.charAt(i)>='A' && s.charAt(i)<='Z')||a!=i &&( s.charAt(i)>='a' && s.charAt(i)<='z' || a!=i && s.charAt(i)==' ' ))
			{
				s1=s1+s.charAt(i);
			}
		}
		return s1;
	}

}
