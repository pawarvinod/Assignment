package com.yash.Dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import com.yash.model.BaseLocationName;


public class BaseLocationDao {
	HibernateTransactionManager baselovationonj;

	public void setBaselovationonj(HibernateTransactionManager baselovationonj) 
	{
		this.baselovationonj = baselovationonj;
	}
	
	public void saveListOfBaseLocation(BaseLocationName bln)
	{
		SessionFactory sf= baselovationonj.getSessionFactory();
		Session s1 = sf.openSession();
		Transaction b1 = s1.beginTransaction();
		s1.save(bln);
		b1.commit();
		s1.close();
		
	}

	public List<BaseLocationName> getListOfBaseLocation()
	{
		SessionFactory sf = baselovationonj.getSessionFactory();
		Session op = sf.openSession();
		List<BaseLocationName> bln= new ArrayList();
		Criteria cc = op.createCriteria(BaseLocationName.class);
		List list = cc.list();
		return list;
	}

	public void getDepartmentWithAvgSalary() {
        SessionFactory sf = baselovationonj.getSessionFactory();
        Session objSession = sf.openSession();
        Transaction t = objSession.beginTransaction();

        System.out.println("====Print Average salary of each Department====");

        String HQL ="SELECT dept.deptid,dept.dname,Avg(emp.salary) FROM Department dept "
                + "LEFT JOIN  dept.employee emp GROUP BY dept";

        Query query= objSession.createQuery(HQL, Object[].class);
        List<Object[]> list = ((org.hibernate.query.Query<Object[]>) query).list();

        for(Object[] objects : list) {
            Integer deptid=(Integer)objects[0];
            String deptname=(String)objects[1];
            Double  avgsalary=(Double)objects[2];
            System.out.println("Department_Id:"+deptid);
            System.out.println("Department_Name:"+deptname);
            System.out.println("Average of  salary by Department:"+avgsalary);
        }
    }
	
	
	public void MinimSalaryWithbaselocation()
	{
        SessionFactory sf = baselovationonj.getSessionFactory();
        Session objSession = sf.openSession();
        Transaction t = objSession.beginTransaction();
        System.out.println("====Print maximum salary of each base location====");
        String HQL ="SELECT b.baselocationid,b.baseLocationName,MIN(e.salary) FROM BaseLocationName b "
                + "LEFT JOIN b.employee e GROUP BY b";
        Query query= objSession.createQuery(HQL, Object[].class);
        List<Object[]> list = ((org.hibernate.query.Query<Object[]>) query).list();
        for(Object[] objects : list) {
        	 Integer baselocationId =(Integer)objects[0];
            String baseLocationName=(String)objects[1];
            Integer  maxsalary =(Integer)objects[2];
            System.out.println("BaseLoaction:"+baseLocationName);
            System.out.println("Baselocatio id:"+baselocationId);
            System.out.println("minimum salary by dept:"+maxsalary);
        }
        
	}
	public void MaxSalaryWithbaselocation()
	{
        SessionFactory sf = baselovationonj.getSessionFactory();
        Session objSession = sf.openSession();
        Transaction t = objSession.beginTransaction();
        System.out.println("====Print maximum salary of each base location====");
        String HQL ="SELECT b.baselocationid,b.baseLocationName,MAX(e.salary) FROM BaseLocationName b "
                + "LEFT JOIN b.employee e GROUP BY b";
        Query query= objSession.createQuery(HQL, Object[].class);
        List<Object[]> list = ((org.hibernate.query.Query<Object[]>) query).list();
        for(Object[] objects : list) {
        	 Integer baselocationId =(Integer)objects[0];
            String baseLocationName=(String)objects[1];
            Integer  maxsalary =(Integer)objects[2];
            System.out.println("BaseLoaction:"+baseLocationName);
            System.out.println("Baselocatio id:"+baselocationId);
            System.out.println("maximum salary by dept:"+maxsalary);
        }
        
	}
}

	
