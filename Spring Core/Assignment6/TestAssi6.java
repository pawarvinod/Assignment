package Assignment6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAssi6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext a6= new ClassPathXmlApplicationContext("application-context.xml");
		Assi6 bean = (Assi6) a6.getBean("bean6");
		bean.noVowel();

	}

}
