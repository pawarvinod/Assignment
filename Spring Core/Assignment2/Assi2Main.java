package Assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assi2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac= new ClassPathXmlApplicationContext("application-context.xml");
		 Assi2Avrage ob=  (Assi2Avrage) ac.getBean("assi2beans");
		 ob.getAvrage();

	}

}
