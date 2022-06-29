package TDDAssignment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class AssignmentTesting {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int  b=sc.nextInt();
  
	
//	@Test
//	void test() {
//		
//	assertEquals(30 ,Assignment1.number(a, b));
//	}

//	Scanner sc=new Scanner(System.in);
	/*
	 * String s1=sc.nextLine();
//	 */String s2=sc.nextLine();


@Test
	void test() 
   {
	System.out.println("Enter Palimdrome number");	
	assertEquals(true ,Assignment2.paliNumber());
	}
//	
//	@Test
//	void passwordTest()
//	{
//		assertEquals(true, Assignment3.chekPassAndEmail());
//	}
//	
//	@Test
//	void Test5()
//	{
//		assertEquals(true, Assignment5.ispaytho());
//	}
//@Test
//void test6()
//{
//	assertEquals(2, Assignment6.countVowels());
//}




}
