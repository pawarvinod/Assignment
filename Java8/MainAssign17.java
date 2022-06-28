package Assignment17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainAssign17 {
	
		public static void main(String[] args)
		{
			List<Assingn17> elist=new ArrayList<Assingn17>();
			elist.add(new Assingn17("Akash", LocalDate.of(1995, 05, 27), LocalDate.of(2022, 04, 29),LocalDate.of(2023, 04, 29), "Hinjewadi PhaseIII", "JAVA", 32500));
			elist.add(new Assingn17("Akshay", LocalDate.of(1996, 07, 22), LocalDate.of(2022, 04, 27),LocalDate.of(2023, 04, 27), "Banglore", "JAVA", 23471));
			elist.add(new Assingn17("Shubham", LocalDate.of(1997, 03, 15), LocalDate.of(2022, 04, 25),LocalDate.of(2023, 04, 25), "Indore", "JAVA", 27400));
		
//			System.out.println("----------Avarage salary");
//		 Double avgsalary=	elist.stream().collect(Collectors.averagingLong(e->e.eSalary));
//			System.out.println("Avrage Salary is :"+avgsalary);
//			
//			System.out.println("------Upcoming birthday");
//			
//			 for(Assingn17 e:elist)
//	            {
//	                if(e.eDor!=null )
//	                {
//	                int exp=Period.between(e.eDoj, e.eDor).getYears();
//	                System.out.println(e.eName+" Experience "+exp+" Years.");
//		
//	                  }
//	            }
			
		//	AVG SALARY BY DEPT_--------------------------------
			Double totalavg1=elist.stream().filter(e ->"JAVA" == e.geteDepartment()).collect(Collectors.averagingDouble(Assingn17::geteSalary));
			Double totalavg2=elist.stream().filter(e ->"AWS" == e.geteDepartment()).collect(Collectors.averagingDouble(Assingn17::geteSalary));



			System.out.println("Total Employees salary of JAVA dep :"+ totalavg1);
			System.out.println("Total Employees salary of AWS dep :"+ totalavg2);



			// Highest and lowest salary of each department

			Long maxSalary = elist.stream().filter(Deptm ->"JAVA" ==Deptm.geteDepartment())
			.map(Assingn17::geteSalary)
			.max(Long::compare).get();
			Long minSalary = elist.stream().filter(Deptm ->"JAVA" ==Deptm.geteDepartment())
			.map(Assingn17::geteSalary)
			.min(Long::compare).get();

			System.out.println("maxmium of sal by dept:- " +maxSalary);
			System.out.println("minimum of sal by dept:- "+minSalary);


			// Department with highest no of employee and lowest
			String deptt1= elist.stream()
			.map(Assingn17::geteDepartment)
			.max(String::compareTo).get();

			String deptt2= elist.stream()
			.map(Assingn17::geteDepartment)
			.min(String::compareTo).get();
			System.out.println("Department with highest no of employee:- "+ deptt1);
			System.out.println("Department with Lowest no of employee:- "+ deptt2);


			///Current date
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			System.out.println("Current Date >>> " + dtf.format(now));
			System.out.println("Get month >>> " + now.getMonth());
			System.out.println("Current Date >>> " + now.getDayOfMonth());

			// Total number of years of experience of each employee.

			System.out.println("------------------No of Experience In years of each Employee-------");
			for(Assingn17 e:elist)
			{
			if(e.eDor!=null )
			{
			int exp=Period.between(e.eDoj, e.eDor).getYears();
			System.out.println(e.eName+" Experience "+exp+" Years.");
			}
			}

			// Upcoming birthday and job anniversary in current month from current date to last

			System.out.println(" ---------------Upcoming birthday and job anniversary Employee-------");

			LocalDate currentdate=LocalDate.now();

			List<Assingn17> bns=elist.stream().filter(e->e.eDob.getDayOfMonth()>=currentdate.getDayOfMonth()).collect(Collectors.toList());
			for (Assingn17 a : bns)
			{
			System.out.println("Birth day of "+a.eName+" and Birth Date is "+a.eDob);
			}
			List<Assingn17> bnames1=elist.stream().filter(e->e.eDoj.getDayOfMonth()>=currentdate.getDayOfMonth()).collect(Collectors.toList());
			for (Assingn17 a : bnames1)
			{
			System.out.println("Job Anniversary of "+a.eName+" and Anniversary Date is "+a.eDoj);
			}
		}

}
		
