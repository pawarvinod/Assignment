package com.yash.opration;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.CombineClassDao;
import com.yash.dao.ResultDao;
import com.yash.dao.Studentdao;
import com.yash.model.Classs;
import com.yash.model.CombineClass;
import com.yash.model.Result;
import com.yash.model.Student;

public class ResultOpration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext objc = new ClassPathXmlApplicationContext("Application-Context.xml");
		ResultDao re = (ResultDao) objc.getBean("resultbean");
		Studentdao obj = (Studentdao) objc.getBean("sdao");
		CombineClassDao cc=(CombineClassDao) objc.getBean("cbeans");
		Result res= new Result();
//		
//   	   Scanner scr= new Scanner(System.in);
//		   System.out.println("Enter result id");
//		   res.setRid(scr.nextInt());
//		   System.out.println("Enter math marks");
//		   res.setMaths(scr.nextInt());
//		   System.out.println("Enter hindi marks");
//		   res.setHindi(scr.nextInt());
//		   System.out.println("enter english marks");
//		   res.setEnglish(scr.nextInt());
//		   System.out.println("Enter science marks");
//		   res.setScience(scr.nextInt());
//		   System.out.println("Enter sanscrt marks");
//		   res.setSanskrit(scr.nextInt());
//		   System.out.println("Enter student id");
//		   res.setSid(scr.nextInt());
//		   System.out.println("Enter date");
//		   String s=scr.next();
//		   Date date=Date.valueOf(s);
//		   res.setDatetime(date);
//		   System.out.println(re.insertResult(res));
//		   re.getResult();
//
		
		Studentdao st = new Studentdao();
		//==============================================
		//Q7
		   System.out.println("--------average marks of each class ----------- ");
	        List<CombineClass> list=cc.getComnineResult();
	        int total=0,total2=0;
	        int cnt=0,cnt1=0;
	        for (CombineClass c : list)
	        {
	            if(c.getClassname().equals("eight") )
	            {
	                cnt++;
	                total = total + c.getMaths() + c.getEnglish() +c.getHindi() + c.getScience() + c.getSanskrit();
	            }
	            if(c.getClassname().equals("ten"))
	            {
	                cnt1++;
	                total2 = total2 + c.getMaths() + c.getEnglish() +c.getHindi() + c.getScience() + c.getSanskrit();
	            }

	        }
	        System.out.println("Average maraks of Class Eight  = "+(total/cnt));
	        System.out.println("Average maraks of Class Ten  = "+(total2/cnt1));
		
		
		
		//================================================
	    //Find out average marks of each subject per class and per section=
        System.out.println("-------------------Question 7-------------------------");
        List<CombineClass> cblist= cc.getComnineResult();
        int addm=0,addh=0,adds=0,addsk=0,adde=0;  //8 ab
        int adm=0,adh=0,ade=0,adsk=0,ads=0; //8 ac
        int sume=0, sumss=0,summ=0,sumh=0,sumsk=0,scount=0,ecount=0,count=0; //10-av
        for (CombineClass cb : cblist)
        {      
            if(cb.getClassname().equals("ten") && cb.getSectionname().equals("av"))
            {  
                count++;
                summ= summ + cb.getMaths();
                sume= sume + cb.getEnglish();
                sumh= sumh + cb.getHindi();
                sumsk= sumsk +cb.getSanskrit();  
                sumss=sumss+ cb.getScience();


            }
            if(cb.getClassname().equals("eight") && cb.getSectionname().equals("ab"))
            {  
                ecount++;
                addm= addm + cb.getMaths();
                adde= adde + cb.getEnglish();
                addh= addh + cb.getHindi();
                addsk= addsk +cb.getSanskrit();
                adds=adds+ cb.getScience();          
            }
            if(cb.getClassname().equals("six") && cb.getSectionname().equals("af"))
            {  
                scount++;
                adm= adm + cb.getMaths();
                ade= ade + cb.getEnglish();
                adh= adh + cb.getHindi();
                adsk= adsk +cb.getSanskrit();
                ads=ads+ cb.getScience();          
            }

        }
        System.out.println("Average of Math subject in ten av Class is "+(addm/ecount));
        System.out.println("Average of English subject in ten av Class is "+(adde/ecount));  
        System.out.println("Average of Hindi subject in ten av Class is "+(addh/ecount));      
        System.out.println("Average of Science subject in ten av Class is "+(adds/ecount));  
        System.out.println("Average of Sanskrit subject in ten av Class is "+(addsk/ecount));
        System.out.println();
        System.out.println("Average of Math subject in Eight B Class is "+(adm/scount));
        System.out.println("Average of English subject in Eight B Class is "+(ade/scount));  
        System.out.println("Average of Hindi subject in Eight B Class is "+(adh/scount));      
        System.out.println("Average of Science subject in Eight B Class is "+(adsk/scount));  
        System.out.println("Average of Sanskrit subject in Eight B Class is "+(ads/scount));
        System.out.println();
        System.out.println("Average of Math subject in six af Class is "+(summ/count));
        System.out.println("Average of English subject in six af Class is "+(sume/count));  
        System.out.println("Average of Hindi subject in six af Class is "+(sumh/count));      
        System.out.println("Average of Science subject in six af Class is "+(sumss/count));  
        System.out.println("Average of Sanskrit subject in six af Class is "+(sumsk/count));


		
		

//		==============================================/=/===========================/=///==========
//		Find out average marks of each class per section. 
        
		Classs cla= new Classs();
		List<Result> alist = re.getResult();
		List<CombineClass> clist= cc.getComnineResult();
		System.out.println("average marks of each class per section");
		for (CombineClass r1 : clist) 
		{
			int id=r1.getSid();
//			int total=0;
			 total=total+r1.getEnglish()+r1.getHindi()+r1.getMaths()+r1.getSanskrit()+r1.getScience();
			 int avg=total*100/500;
			
			 if(r1.getClassid()==10 || r1.getSectionname().equals("ab"))//first standard divison b
			 {
				 if(r1.getClassid()==11 || r1.getSectionname().equals("ac"))
				 {
					 if(r1.getClassid()==12 || r1.getSectionname().equals("av"))
					 {
						 if(r1.getClassid()==13 || r1.getSectionname().equals("af"))
						 {
						
				 List<Student > slist = obj.getId(id);

					for (Student s1 : slist) 
					        {

						System.out.println("Student id is : " + s1.getSclassid() + " Student name is : " + s1.getSname()
								+ " Student father name : " + s1.getSfathername());
					        }
				 
			          }
		           }
					 
				 }
			 }
		 }
		
//		=============================/ ================================ //=----==============
//		 number of students who fail to score passing marks ( passing marks 
//				40%). And print details of students
		System.out.println("number of students who fail to score passing marks  less 35 %");

   List<Result> rlist = re.getResult();
		System.out.println("number of students who fail to score passing marks  less 35 %");
		for (Result r1 : rlist) 
		{
			int id=r1.getSid();
//			int total=0;
			 total=total+r1.getEnglish()+r1.getHindi()+r1.getMaths()+r1.getSanskrit()+r1.getScience();
			 int avg=total*100/500;
			 if(avg<=35)
			 {
				 List<Student> slist = obj.getId(id);

					for (Student slist1 : slist) {

						System.out.println("Student id is : " + slist1.getSclassid() + " Student name is : " + slist1.getSname()
								+ " Student father name : " + slist1.getSfathername());
					}
				 
			 }
		}
//		
///================
//		t total number of students who score more than 75%. and print details of 
//		students============
		System.out.println("number of students who fail to score passing marks  greter 60 %");
		List<Result> llist = re.getResult();
		System.out.println("number of students who fail to score passing marks  greter 60 %");
		for (Result r1 : llist) 
		{
			int id=r1.getSid();
//			int total=0;
			 total=total+r1.getEnglish()+r1.getHindi()+r1.getMaths()+r1.getSanskrit()+r1.getScience();
			 int avg=total*100/500;
			 if(avg>=60)
			 {
				 List<Student> slist = obj.getId(id);

					for (Student slist1 : slist) {

						System.out.println("Student id is : " + slist1.getSclassid() + " Student name is : " + slist1.getSname()
								+ " Student father name : " + slist1.getSfathername());
					}
				 
			 }
		}
	
		//================================================================

		//// total number of students which are absent in one subject exam
//		System.out.println("  list of student which is fail in one subject");
		for (Result r : rlist) {
			int count1 = 0;
			if (r.getEnglish() == 0)
			{
				count1++;//totalm=totalm+r.g
			}
			if (r.getHindi() == 0) {
				count1++;
			}
			if (r.getSanskrit() == 0) {
				count1++;
			}
			if (r.getMaths() == 0) {
				count1++;
			}
			if (r.getScience() == 0) {
				count1++;

			}

			if (count1 == 1) {

				int id = r.getSid();

				
				List<Student> slist = obj.getId(id);

				for (Student slist1 : slist) {

					System.out.println("Student id is : " + slist1.getSclassid() + " Student name is : " + slist1.getSname()
							+ " Student father name : " + slist1.getSfathername());
				}
			}
		}
		//============================================///=================================/====/=============/
		System.out.println("Student absent in more than two subject,,,,,,,,,,,,,");
		for (Result r : rlist) {
			int count1 = 0;
			if (r.getEnglish() == 0) {
				count1++;
			}
			if (r.getHindi() == 0) {
				count1++;
			}
			if (r.getSanskrit() == 0) {
				count1++;
			}
			if (r.getMaths() == 0) {
				count1++;
			}
			if (r.getScience() == 0) {
				count1++;
			}

			if (count1==1)
			{

				int id = r.getSid();
				List<Student> slist = obj.getId(id);

				for (Student slist1 : slist) {

					System.out.println("Student id is : " + " Student name is : " + slist1.getSname()
							+ " Student father name : " +slist1.getSfathername());
				}

			} 
			}
	}
}
