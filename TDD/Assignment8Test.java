package TDDAssignment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class Assignment8Test {

//	Scanner sc = new Scanner(System.in);
//	int a=sc.nextInt();
	@Test
	void checkEvenOdd()
	{
	assertEquals(true, Assignment8.checkEvenOdd());
	}

}
