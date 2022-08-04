package com.yash.oprate;

import java.sql.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yash.dao.BillDao;
import com.yash.model.Bill;

public class BillOprate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap= new ClassPathXmlApplicationContext("applicationcontext.xml");
		BillDao bdao=  (BillDao) ap.getBean("bdao");
		Bill b= new Bill();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter bill id");
		b.setBillid(sc.nextInt());
		System.out.println("Enter custermer id");
		b.setCustomerid(sc.nextInt());
		System.out.println("Enter date of bill");
		String s= sc.next();
		Date d1=Date.valueOf(s);
		b.setDateifbill(d1);
		bdao.insertBill(b);

	}

}
