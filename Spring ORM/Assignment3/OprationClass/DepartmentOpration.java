package com.yash.Operation;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yash.Dao.DepartmentDao;
import com.yash.model.Department;


public class DepartmentOpration {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ApplicationContext apa=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Scanner sc =new Scanner(System.in);
		Department dp= new Department();
//		System.out.println("Enter department id");
//		dp.setDeptid(sc.nextInt());
//		System.out.println("Enter deparment name");
//		dp.setDname(sc.next());
//		dpbean.saveListOfDepartment(dp);
//	501	dpbean.getDepartmentWithAvgSalary();
//		dpbean.getDepartmentWithAvgSalary();

	}

}
