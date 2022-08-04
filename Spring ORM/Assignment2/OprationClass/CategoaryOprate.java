package com.yash.oprate;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.CategoryDao;
import com.yash.model.Category;
import com.yash.model.Item;

public class CategoaryOprate {

	public static void main(String[] args) 
	{
		ApplicationContext ac= new ClassPathXmlApplicationContext("applicationcontext.xml");
		CategoryDao catdoa=  (CategoryDao) ac.getBean("catbean");
		Category cat=new Category();
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter cat id");
//		cat.setCatid(sc.nextInt());
//		System.out.println("Enter cat name");
//		cat.setCatname(sc.next());
//		catdoa.insertCategory(cat);
//		List<Category> clist=catdoa.getCategoary();
//		for (Category cat : clist)
//		{
//			System.out.println(cat.getCatid()+" "+cat.getCatname());
//		}

		System.out.println("         total number of item in each category");
	  List<Category>catd=	catdoa.getCategoary();
		int count=0;
		for(Category it:catd)
		{
			int id1=it.getCatid();
		
			
			if(it.getCatid()==31)
			{
				count++;
		
				System.out.println(" cat id : "+it.getCatid()+" cat name: "+it.getCatname());		
			}
	   }
		System.out.println("  Number of item "+count);

    }
}