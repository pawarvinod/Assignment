package com.yash.Operation;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yash.Dao.BaseLocationDao;
import com.yash.Dao.DepartmentDao;
import com.yash.Dao.EmplDao;
import com.yash.Dao.ProjectDao;
import com.yash.model.Department;
import com.yash.model.Employee;
import com.yash.model.Project;

public class EmplOperation 
{
	public static void main(String[] args) 
  {
		ApplicationContext objc=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee eam=new Employee();
		EmplDao objED=(EmplDao) objc.getBean("empdao");
		DepartmentDao dpbean = (DepartmentDao) objc.getBean("debean");
//		dpbean.getDepartmentWithAvgSalary(); 
		 BaseLocationDao bldao=(BaseLocationDao) objc.getBean("basebean");
		 ProjectDao pbean = (ProjectDao) objc.getBean("pbean");
//		   BaseLocationName bl=new BaseLocationName();
		 
//		 Q. 4 ========maximum salary of each base location. ======
		    bldao.MaxSalaryWithbaselocation();
		    
//		    Q. 5  ==========maximum salary of each projects. ======
//		    pbean.getMaximumSalaryEachProject();
		    
//		    Q. 6 ========minimum salary of each base location. ======
//		    bldao.MinimSalaryWithbaselocation();
//		   ================Print Average salary of each Department==========
//		    Q . 9
		    bldao.getDepartmentWithAvgSalary();
		    
		   
		    List<Project> listOfProject = pbean.getListOfProject();
		    
		    
//		     Q. 7
//		    pbean.getMinimumSalaryEachProject();
		    
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter employye id");
//		eam.setEmpid(sc.nextInt());
//		System.out.println("Enter employee name");
//		eam.setEmpname(sc.next());
//		System.out.println("employee address");
//		eam.setEaddress(sc.next());
//		System.out.println("Enter IRM id name");
//		eam.setIRMId(sc.nextInt());
//		System.out.println("Enter employee location id");
//		eam.setBaselocationid(sc.nextInt());
//		System.out.println("Enter employee deaprtment id");
//		eam.setDeptid(sc.nextInt());
//		System.out.println("Enter employee designation");
//		eam.setDesignation(sc.next());
//		System.out.println("Enter employee date of birth");
//		String s=sc.next();
//		Date date=Date.valueOf(s);
//		eam.setEdob(date);
//		System.out.println("enter employee date of  joing");
//		String s1=sc.next();
//		Date date1=Date.valueOf(s1);
//		eam.setEdoj(date1);
//		System.out.println("Enter employee date of leaving ");
//		Date date2=Date.valueOf(sc.next());
//		eam.setEdol(date2);
//		System.out.println("Enter projected");
//		eam.setProjected(sc.next());
//		System.out.println("Enter employee salary");
//		eam.setSalary(sc.nextInt());
//		objED.saveListOfEmpl(eam);
//		
//		    Q. 8 total number of employees in each department
		    
			List<Department> ld = dpbean.getListOfDepartment();
			System.out.println("Q 8.====total number of employees in each department========");
			for (Department d : ld) 
			{
				int count=0;				
				List<Employee> employee = d.getEmployee();
				System.out.println("department name :"+d.getDname());
				for (Employee e : employee) 
				{
					count++;		
				}			
				System.out.println("number of employee : "+count);
			}
			
//			===========Q.9 average salary of each department=========
			for (Department d : ld) 
			{
				double avg=0;
				int count=0;
				int sum=0;
				System.out.println("Department name : "+d.getDname());
				List<Employee> employee = d.getEmployee();
				for (Employee e : employee) 
				{
					count++;
					sum=sum+e.getSalary();
					avg=sum/count;
				}
				System.out.println("Avarage salary of each deparment : "+avg);
			}
			
			
//			Q.10 Print total number of employee working under each project manager.================
			System.out.println("========Q.10 Print total number of employee working under each project manager==");
			for (Project p : listOfProject) 
			{
//				System.out.print();
			
				int count=0;
				List<Employee> employee = p.getEmployee();
				for (Employee e : employee) 
				{
					count++;
				}
				System.out.println("Project name : "+p.getProjectname()+" "+count);
			
			}
//	=======Q.11 Print details of projects along with employee working on it	
			System.out.println("=======Q.11 Print details of projects along with employee working on it");
			for (Project d : listOfProject) 
			{
//				System.out.println();
				List<Employee> employee = d.getEmployee();
				for (Employee e : employee)
				{
					String s=e.getProjected();
					if(s.equals("yes"))
					{
						System.out.println("Project name : "+d.getProjectname());
					System.out.println("Project status : "+e.getProjected());
					System.out.println("Project id : "+d.getProjectid());
					System.out.println("Project manager id : "+d.getPromempid());
					}
				}
			}
			
//		Q.	1) Find out number of employee working on different project.
			System.out.println("========= Q. 1 find out number of employee working on different project.=====");
			for (Project p : listOfProject) 
			{
				int count=0;
//				String s=p.getEmployee().get;
				
				List<Employee> employee = p.getEmployee();
				for (Employee e : employee) 
				{
					String p1 = e.getProjected();
					if(p1.equals("yes"))
					{
						count++;
					System.out.println("Project name : "+p.getProjectname());
					System.out.println("Name of employee : "+e.getEmpname());
					System.out.println("Number of employee :"+count);
					}
				}
			}
	}
}
