package com.yash.Operation;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yash.Dao.BaseLocationDao;
import com.yash.model.BaseLocationName;
public class BaseLocationOpratration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	   
	    Scanner sc = new Scanner(System.in);
//	    System.out.println("Enter location id");
//	    bl.setBaselocationid(sc.nextInt());
//	    System.out.println("Enter base location name");
//	    bl.setBaseLocationName(sc.next());
//	    bldao.saveListOfBaseLocation(bl);
	    //bldao.updateLocation(bl);
	    
//	    bldao.MaxSalaryWithbaselocation();
//	    bldao.getListOfBaseLocation();
////	    bldao.getDepartmentWithAvgSalary();
	}

}
