package Assignment10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAssi10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac1= new ClassPathXmlApplicationContext("application-context.xml");
		Assi10 ab=   (Assi10) ac1.getBean("bean10");
		ab.issorted();

	}

}
