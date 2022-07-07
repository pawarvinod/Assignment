package Assignment15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac= new ClassPathXmlApplicationContext("application-context.xml");
		Custmer it= (Custmer) ac.getBean("itembean11");
        it.purchasedItem();
	}

}
