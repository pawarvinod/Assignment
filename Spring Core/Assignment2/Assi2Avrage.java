package Assignment2;

import java.util.Scanner;

import javax.annotation.PostConstruct;

public class Assi2Avrage {
	
int a[]= new int[6];

public Assi2Avrage(int[] a)
{
//	super();
	this.a = a;
}

@PostConstruct
private double getUser()
{
	int sum=0;
	int count=0;
	for (int i = 0; i < a.length; i++) 
	{
		sum+=a[i];
		count++;
	}
	 double avr=sum/a.length;
	return avr;

}
public void getAvrage()
{
	System.out.println(getUser());
}
}
