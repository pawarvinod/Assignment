package com.yash.opration;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.ClasssDao;
import com.yash.model.Classs;

public class ClasssOpration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext obct= new ClassPathXmlApplicationContext("Application-Context.xml");
		ClasssDao cd= (ClasssDao) obct.getBean("classbean");
		Scanner sc = new Scanner(System.in);
		Classs cl= new Classs();
		System.out.println("Enter your class id");
		cl.setClassid(sc.nextInt());
		System.out.println("Enter your class name");
		cl.setClassname(sc.next());
		System.out.println("Enter your section ");
		cl.setSectionname(sc.next());
		cd.insertClasss(cl);

	}

}
