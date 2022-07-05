package Assignment8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac= new ClassPathXmlApplicationContext("application-context.xml");
		 Assi8Item bean= (Assi8Item) ac.getBean("itembean");
		 bean.ascending();
		 bean.decending();

	}

}
