package Assignment11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//. WAP in which you will enter employee detail and department names. Now you have to 
		//found the following.
		//a. Find maximum salary in a department. 
		//b. Print name of employees having highest salary
		//c. Name of employee having salary less than or equal to average salary.
		//d. Average salary of each department.


public class Assi11Employee 
{

	int eid;
	String ename;
	String dname;
	int salary;
	
	public Assi11Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Assi11Employee(int eid, String ename, String dname, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dname = dname;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void emploInfo(List<Assi11Employee> list)
	{
		

		//a. Find maximum salary in a department. 
				
				
				

		Assi11Employee obj = list.stream().max((s1,s2)->s1.salary>s2.salary?1:-1).get();
		System.out.println(" maximum salray of employee: "+obj.salary);
		
		//b. Print name of employees having highest salary
		Assi11Employee obj1 = list.stream().max((s1,s2)->s1.salary>s2.salary?1:-1).get();
		System.out.println(" name of employye which hiving high salray : "+obj1.ename);
		
		//c. Name of employee having salary less than or equal to average salary.
		
		double average= list.stream().collect(Collectors.averagingInt(s1->s1.salary));
		
		List<Assi11Employee> less= list.stream().filter(s->s.salary<=average).collect(Collectors.toList());
		
		for(Assi11Employee v: less)
		{
		 System.out.println(" Employee name is : "+v.ename+" "+" & avarage salray is : "+v.salary );
		}
		
		
		 //d. Average salary of each department.
		
		
		Double sal2 = list.stream().filter(e->e.dname.endsWith("java")).collect(Collectors.averagingInt(s1->s1.salary));
		System.out.println(" Average salary of java department : "+sal2);
		
	
		 
	}
	
	
	

}
