package Assignment5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAssi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac= new ClassPathXmlApplicationContext("application-context.xml");
		 Assi5  an = (Assi5) ac.getBean("assi5bean");
		 an.maximum();

	}

}
