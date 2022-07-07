package Assignment11;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assi11Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext a11= new ClassPathXmlApplicationContext("application-context.xml");
	    Assi11Employee am= 	(Assi11Employee) a11.getBean("bean11");
	    Assi11Employee an= 	(Assi11Employee) a11.getBean("bean12");
	    Assi11Employee ao= 	(Assi11Employee) a11.getBean("bean13");
	    Assi11Employee ap= 	(Assi11Employee) a11.getBean("bean14");
	    
	    List<Assi11Employee> elist= new ArrayList<Assi11Employee>();
	    elist.add(am);
	    elist.add(an);
	    elist.add(ao);
	    elist.add(ap);  
	    am.emploInfo(elist);

	}

}
