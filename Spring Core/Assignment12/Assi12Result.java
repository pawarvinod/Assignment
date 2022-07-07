package Assignment12;

import java.util.Collections;
import java.util.Comparator;
//WAP in spring core where we will inject dependent object of result class in student class. In 
//student class following fields will be present studentname, rollno, date of birth, classname, 
//section. Result class will have following fields, rollno, maths,hindi,English, science, as subject 
//name. Create five bean of each and inject the bean as per roll no. Now you need to load the 
//bean from container. Load all the objects in List and filter the data on the basis of total 
//marks obtain by each student.
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.util.comparator.Comparators;

public class Assi12Result {
	int rrollNo;
	String rname;
	int hindi;
	int science;
	int english;
	int math;
	int total;
	Assi12Student obj1;// student

	public int getRrollNo() {
		return rrollNo;
	}

	public void setRrollNo(int rrollNo) {
		this.rrollNo = rrollNo;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total =(( getHindi()) + (getEnglish()) + (getMath()) + (getScience()));
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Assi12Student getObj1() {
		return obj1;
	}

	public void setObj1(Assi12Student obj1) {
		this.obj1 = obj1;
	}

	public void sortByMarks(List<Assi12Result> obj1) {
		
		System.out.println("Student name and marks of student");
		for(Assi12Result v:obj1)
		{
			System.out.println("Student name : "+v.obj1.sstudentName+" Student Marks : "+v.getTotal());
		}
	
		System.out.println(" Student name total marks of student sort by marks");
	Comparator<Assi12Result> result=	Comparator.comparing(Assi12Result:: getTotal);
		Collections.sort(obj1,result);
		
		for(Assi12Result res:obj1)
		{
			System.out.println("Student name : "+res.obj1.sstudentName+"   Marks   "+ res.getTotal());
		}
	}

}
