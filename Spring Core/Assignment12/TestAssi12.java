package Assignment12;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAssi12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext a12= new ClassPathXmlApplicationContext("application-context.xml");
		Assi12Result stu=  (Assi12Result) a12.getBean("bean22");
		Assi12Result stv=  (Assi12Result) a12.getBean("bean33");
		Assi12Result stw=  (Assi12Result) a12.getBean("bean35");
		Assi12Result stx=  (Assi12Result) a12.getBean("bean37");
		Assi12Result sty=  (Assi12Result) a12.getBean("bean39");
		
		List<Assi12Result> stuonj= new ArrayList<Assi12Result>();
		stuonj.add(stu);
		stuonj.add(stv);
		stuonj.add(stw);
		stuonj.add(stx);
		stuonj.add(sty);
		stu.sortByMarks(stuonj);  
		
		
	}

}
