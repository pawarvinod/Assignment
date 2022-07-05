package Assignment7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAssi7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac7= new ClassPathXmlApplicationContext("application-context.xml");
		Assi7class1 ac=   (Assi7class1) ac7.getBean("bean7");
		ac.margeArray();

	}

}
