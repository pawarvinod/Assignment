package TDDAssignment;

public class Assignment7 {
		
	public static boolean ispalindrome(String s,int length,String rev)
	{

//		String s="yashTEchnology";
//		int i=0;
//		int j=s.length()-1;
//		char[] ch=s.toCharArray();
//		while(j<i)
//		{
//			char c=ch[i];
//			ch[i]=ch[j];
//			ch[j]=c;	
//			i++;
//			i--;
//		}
//		String s1=new String(ch);
//		System.out.println(ch);
		
		for (int i=s.length()-1;i>=0;i--) 
		{
			rev=rev+s.charAt(i);
		}
		if(s.toLowerCase().equals(rev.toLowerCase()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
