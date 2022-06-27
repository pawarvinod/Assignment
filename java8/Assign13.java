package Assignment13;

public class Assign13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a []= { 1,2,3,6,7,8,10,11,12,13,14,17,18,19,20};
		
		// want output like 1-3,6-8,10-14,17-20

		
		int firs=0;
		int last=0;
		int data=0;
		for (int i = 0; i < a.length-1; i++)
		{
			if(i==0)
			{
				firs=a[0];
				for (int j = i; j < a.length-1; j++)
				{
					if(a[j+1]-1!=a[j])
					{
						last=a[j];
						break;
					}
				}
				System.out.println(firs+" -"+last);
			}
			else if(a[i+1]-a[i]>=2)
			{
		       firs=a[i+1];
		       for (int j = i+1; j < a.length-1; j++)
		       {
				if(a[j+1]-1!=a[j])
				{
					data=a[j];
					break;
				}
				if(j==a.length-2)
				{
					last=a.length-2;
				}
			}
		       System.out.println(firs+" -"+data);
			}
		}
		
	}

}
