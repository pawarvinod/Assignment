package TDDAssignment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class Assignment4Test {

	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	int data=num;
	int temp=0;
	int res=0;
	@Test
	void test() {
		assertEquals(true, Assignment4.amstromg(num, data, temp, res));
	}

}
