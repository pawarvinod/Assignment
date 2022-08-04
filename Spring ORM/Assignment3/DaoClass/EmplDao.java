package com.yash.Dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import com.yash.model.Employee;

public class EmplDao
{
	HibernateTransactionManager hbmobj1;

	public void setHbmobj1(HibernateTransactionManager hbmobj1) 
	{
		this.hbmobj1 = hbmobj1;
    }
	
	public List<Employee> getListOfEmployee()
	{
		SessionFactory sf = hbmobj1.getSessionFactory();
		Session op = sf.openSession();
		List<Employee> el= new ArrayList();
		Criteria cc = op.createCriteria(Employee.class);
		List list = cc.list();
		return list;
	}
	
	public void saveListOfEmpl(Employee emp)
	{
		SessionFactory sf=hbmobj1.getSessionFactory();
		Session objes=sf.openSession();
		Transaction tn=objes.beginTransaction();
		objes.save(emp);
		tn.commit();
		objes.close();
	}
//	public void getListOfEmployye() 
//	{
//		
//        SessionFactory sf = hbmobj1.getSessionFactory();
//        Session objSession = sf.openSession();
//        Transaction t = objSession.beginTransaction();
//
//        String HQL="select e.empid, e.empname,e.eaddress,e.edob,e.edoj,e.edol,e.salary,e.deptid,e.designation,e.IRMId,e.projected,e.baselocationid from Employee e";
//
//        Query query= objSession.createQuery(HQL, Object[].class);
//        List<Object[]> list = ((org.hibernate.query.Query<Object[]>) query).list();
//
//        for(Object[] objects : list) 
//        {
//        	
//            Integer empid=(Integer)objects[0];
//            String empname=(String)objects[1];
//            String  eaddress=(String)objects[2];
//            Date edob=(Date)objects[3];
//            Date edoj=(Date)objects[4];
//            Date edol=(Date)objects[5];
//        	int salary=(Integer)objects[6];
//            int deptid=(Integer)objects[7];
//        	String designation=(String)objects[8];
//        	int IRMId=(Integer)objects[9];
//        	String projected=(String)objects[10];
//        	int baselocationid=(Integer)objects[11];
//        	
//            System.out.println("Employee id:"+empid);
//            System.out.println("Employee_Name:"+empname);
//            System.out.println("Employee address :"+eaddress);
//            System.out.println("Employee date of birthday:"+edob);
//            System.out.println("Employee date of joining :"+edoj);
//            System.out.println("Employee date of leaving  :"+edol);
//            System.out.println("Employee salary:"+salary);
//            System.out.println("Employee departent id:"+deptid);
//            System.out.println("Employee designnation :"+designation);
//            System.out.println("Employee irm id:"+IRMId);
//            System.out.println("Employee projected or not:"+projected);
//            System.out.println("Employee baselocation id  :"+baselocationid);
//        }
//	}
//	

}
