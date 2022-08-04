package com.yash.Dao;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import com.yash.model.Project;

public class ProjectDao
{
	HibernateTransactionManager projectdaoobj;

	public void setProjectdaoobj(HibernateTransactionManager projectdaoobj) 
	{
		this.projectdaoobj = projectdaoobj;
	}
	

	public void saveListOfProject(Project pj)
	{

		SessionFactory sf1=projectdaoobj.getSessionFactory();
		Session objes=sf1.openSession();
		Transaction tn=objes.beginTransaction();
		objes.save(pj);
		tn.commit();
		objes.close();
		
	}
	
	public List<Project> getListOfProject()
	{
		SessionFactory sf = projectdaoobj.getSessionFactory();
		Session op = sf.openSession();
		List<Project> p = new ArrayList();
		Criteria cc = op.createCriteria(Project.class);
		List list = cc.list();
		return list;
	}
	public void getMinimumSalaryEachProject() {
        SessionFactory sf = projectdaoobj.getSessionFactory();
        Session objSession = sf.openSession();
        Transaction t = objSession.beginTransaction();

        System.out.println("====minimum salary of each projects.====");

        Query query =objSession.createQuery("SELECT p.Projectid,p.projectname,min(e.salary) FROM Project p"
                + "full JOIN  p.employee e GROUP BY p");
        List<Object[]> list = ((org.hibernate.query.Query<Object[]>) query).list();
      

        for(Object[] objects : list) {
            Integer deptid=(Integer)objects[0];
            String deptname=(String)objects[1];
            Integer  minsalary=(Integer)objects[2];
            System.out.println("Project id:"+deptid);
            System.out.println("Project_Name:"+deptname);
            System.out.println("minimum salary of each project:"+minsalary);
        }


	}
	public void getMaximumSalaryEachProject() {
        SessionFactory sf = projectdaoobj.getSessionFactory();
        Session objSession = sf.openSession();
        Transaction t = objSession.beginTransaction();

        System.out.println("====minimum salary of each projects.====");

        Query query =objSession.createQuery("SELECT p.Projectid,p.projectname,max(e.salary) FROM Project p"
                + "full JOIN  p.employee e GROUP BY p");
        List<Object[]> list = ((org.hibernate.query.Query<Object[]>) query).list();
      

        for(Object[] objects : list) {
            Integer deptid=(Integer)objects[0];
            String deptname=(String)objects[1];
            Integer  minsalary=(Integer)objects[2];
            System.out.println("Project id:"+deptid);
            System.out.println("Project_Name:"+deptname);
            System.out.println("maximum salary of each project:"+minsalary);
        }


	}
}
