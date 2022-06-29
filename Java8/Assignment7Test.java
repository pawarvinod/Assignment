package TDDAssignment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

  class Assignment7Test {

	Scanner sc = new Scanner(System.in);
	String s=sc.next();
	int length=s.length();
	String rev="";
	@Test
	void palimdrome() {
		assertEquals(true,Assignment7.ispalindrome(s, length, rev));
	}

}
