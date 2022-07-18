package com.yash.opration;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.Studentdao;
import com.yash.model.Student;

public class StudentsOp
{
	public static void main(String[] args)
	{
		ApplicationContext objctx= new ClassPathXmlApplicationContext("Application-Context.xml");
		Studentdao obj= (Studentdao) objctx.getBean("sdao");
		Student sobj= new Student();	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter student details");
		System.out.println("Enter roll Student id");
		sobj.setSid(sc.nextInt());
		System.out.println("Enter student name");
		sobj.setSname(sc.next());
		System.out.println("Enter father name");
		sobj.setSfathername(sc.next());
		System.out.println("Enter mother name");
		sobj.setSmothername(sc.next());
		System.out.println("Enter class id");
		sobj.setSclassid(sc.next());
		System.out.println("Enter add1 ");
		sobj.setSadd1(sc.next());
		System.out.println("Enter add2");
		sobj.setSadd2(sc.next());
		System.out.println("Enter pincode");
		sobj.setSpincode(sc.nextInt());
		System.out.println("Enter addhar number");
		sobj.setSadharno(sc.nextInt());
		System.out.println("enter date of birth");
		String str =sc.next();
		Date date = Date.valueOf(str);
		sobj.setSdob(date);
		System.out.println("Enter date of addmmintion");
		String str1 =sc.next();
		Date date1 = Date.valueOf(str1);
		sobj.setSdoa(date1);
		obj.insert(sobj);
		obj.getResultJoin();
		

		List<Student> slist= obj.getResultJoin();
		for (Student s : slist)
		{
			System.out.println(s.getSid());
		}
	}
}
