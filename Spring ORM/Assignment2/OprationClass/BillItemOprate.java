package com.yash.oprate;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.BillItemDao;
import com.yash.model.BillItem;

public class BillItemOprate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationcontext.xml");
		BillItemDao bidao= (BillItemDao) ap.getBean("billitembean");
		BillItem bi= new BillItem();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter bill id");
		bi.setBiid(sc.nextInt());
		System.out.println("Enter  item bill id ");
		bi.setBillid(sc.nextInt());
		System.out.println("Enter item id");
		bi.setItemid(sc.nextInt());
		System.out.println("Enter Qty");
		bi.setQty(sc.nextInt());
		System.out.println("Enter price");
		bi.setPrice(sc.nextInt());
		bidao.insertBillItem(bi);

	}

}
