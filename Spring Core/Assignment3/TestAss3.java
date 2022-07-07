package Assignment3;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAss3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("application-context.xml");
		 Ass3EMI ab=   (Ass3EMI) ac.getBean("bean3");
//		 Ass3EMI ae = new Ass3EMI();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter your loan amount");
		 ab.setAmount(sc.nextInt());
		 System.out.println("Enter your years");
		 ab.setYear(sc.nextInt());
		 ab.interrest();
		

	}

}
