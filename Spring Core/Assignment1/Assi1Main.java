package Com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Assi1Main {
	public static void main(String[] args) {
         ApplicationContext	 ctx = new ClassPathXmlApplicationContext("application-context.xml");
		Assignment1 ass1= (Assignment1) ctx.getBean("assi1Bean");
		ass1.showInfo();
}
}