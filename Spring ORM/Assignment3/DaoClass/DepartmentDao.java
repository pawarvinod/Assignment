package com.yash.Dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import com.yash.model.Department;

public class DepartmentDao {
	
	HibernateTransactionManager objdepatment;

	public void setObjdepatment(HibernateTransactionManager objdepatment)
	{
		this.objdepatment = objdepatment;
	}
	
	public void saveListOfDepartment(Department dp1)
	{
		SessionFactory sf1=objdepatment.getSessionFactory();
		Session objes=sf1.openSession();
		Transaction tn=objes.beginTransaction();
		objes.save(dp1);
		tn.commit();
		objes.close();
	}
	

//	public void getDepartmentWithAvgSalary() {
//        SessionFactory sf = objdepatment.getSessionFactory();
//        Session objSession = sf.openSession();
//        Transaction t = objSession.beginTransaction();
//
//        System.out.println("====Print Average salary of each Department====");
//
//        Query query =objSession.createQuery("SELECT dept.deptid,dept.dname,Avg(emp.salary) FROM Department dept "
//                + "full JOIN  dept.employee emp GROUP BY dept");
//
////        Query query= (HQL, Object[].class);
//        List<Object[]> list = ((org.hibernate.query.Query<Object[]>) query).list();
//
//        for(Object[] objects : list) {
//            Integer deptid=(Integer)objects[0];
//            String deptname=(String)objects[1];
//            Double  avgsalary=(Double)objects[2];
//            System.out.println("Department_Id:"+deptid);
//            System.out.println("Department_Name:"+deptname);
//           System.out.println("Average of  salary by Department:"+avgsalary);
//        }
//
//     }
	
//	public void getNumerOfEmployeeEachDepartment()
//	{
//		SessionFactory sf = objdepatment.getSessionFactory();
//		Session os = sf.openSession();
//		Transaction bt = os.beginTransaction();
//		System.out.println("============total number of employees in each department=====");
//		Query qu= os.createQuery("SELECT d.deptid,d.dname,d.empname count (*) FROM Department d"+"left join d.employee e group by d");
//		
//	    List<Object[]> list =  qu.list();
//
//        for(Object[] objects : list) 
//        {
//            Integer deptid=(Integer)objects[0];
//            String deptname=(String)objects[1];
//            String  ename=(String)objects[2];
//            System.out.println("Department_Id:"+deptid);
//            System.out.println("Department_Name:"+deptname);
//            System.out.println("Employye from each Department:");
//        }
//	}
	
	
	public List<Department> getListOfDepartment()
	{
		SessionFactory sf = objdepatment.getSessionFactory();
		Session op = sf.openSession();
		List<Department> d=new ArrayList<Department>();
		Criteria cr = op.createCriteria(Department.class);
		d=cr.list();
		return d;		
	}
}
	