package Assignment6;

import java.util.List;

//WAP to inject multiple names to a beans and break the names in to array of string and find
//out the string which is having no vowel in it.
public class Assi6 
{
	String ar[]=new String[10];
	public Assi6(String[] ar)
	{
		//super();
		this.ar = ar;
	}




	void noVowel()
	{
		for(int i=0;i<ar.length;i++)
		{
			String s=ar[i];
			char ch[]=s.toCharArray();
			int count=0;
			for (int j = 0; j < ch.length; j++)
			{
				if(ch[j]!='a' && ch[j]!='o' && ch[j]!='u' && ch[j]!='e' && ch[j]!='i' && ch[j]!='A' && ch[j]!='O' && ch[j]!='U' && ch[j]!='E' && ch[j]!='I')
				{
					count++;
				}
				
			}
			if(count==ch.length)
			{
				String s1= new String(ch);
				System.out.println(s1);
			}
		}
	}

}
