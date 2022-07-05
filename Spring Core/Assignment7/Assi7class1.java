package Assignment7;

//WAP to merge two Array from two different class. Two array will get values from the xml file 
//and now find maximum out of the merge array.
public class Assi7class1
{
	
	int a[]= new int[10];//1
	Assi7class2 obj;
	
	public Assi7class1(int[] a, Assi7class2 obj)
	{
//		super();
		this.a = a;
		this.obj = obj;
	}
	
	public void margeArray()
	{
		int c[]= new int[a.length + obj.b.length];//
		int index=0;
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < c.length; i++)
		{
			if(i<obj.b.length)
				c[index++]=a[i];
			if(i<a.length)
				c[index++]=obj.b[i];
			
			
		}
		for (int i = 0; i < c.length; i++)
		{
			if(c[i]>max)
			{
				max=c[i];
			}
		}
		System.out.println(max);
		
		
	}
	

}
