package TDDAssignment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class AssignmentTesting {
		Scanner sc=new Scanner(System.in);	
//		@Test
//		void test1() {
//		assertEquals(2 ,Assignment1.number());
//		}
//	
//	    @Test
//		void test2() 
//	   {
//		
//		assertEquals(true ,Assignment2.paliNumber());
//		}
	
		@Test
		void passwordTest3()
		{
			assertEquals(true, Assignment3.chekPassAndEmail());
		}
		
//		@Test
//		void Test5()
//		{
//			assertEquals(true, Assignment5.ispaytho());
//		}
//	@Test
//	void test6()
//	{
//		assertEquals(2, Assignment6.countVowels());
//    }
}
