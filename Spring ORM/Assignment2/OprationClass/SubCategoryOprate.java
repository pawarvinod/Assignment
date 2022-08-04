package com.yash.oprate;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yash.dao.SubCategoryDao;
import com.yash.model.Item;
import com.yash.model.SubCatgory;

public class SubCategoryOprate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationcontext.xml");
		SubCategoryDao subcatdao=  (SubCategoryDao) ap.getBean("subcatbean");
		SubCatgory subcat= new SubCatgory();
	List<SubCatgory>catlist=	subcatdao.getSubCategory();
	

//	List<Item> llist = re.getResult();
//	System.out.println("number of students who fail to score passing marks  greter 60 %");
//	for (Result r1 : llist) 
//	{
//		int id=r1.getSid();
//	}
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter cat id");
//		subcat.setCatid(sc.nextInt());
//		System.out.println("Enter sub cat id");
//		subcat.setSubcatid(sc.nextInt());
//		System.out.println("Enter sub cat name");
//		subcat.setSubcatname(sc.next());
//		subcatdao.getsubcategory(subcat);

	}

}
