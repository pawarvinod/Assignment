package com.yash.model;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
//@Table(name = "empl")
public class Employee
{
	@Id
	int empid;
	String empname;
	String eaddress;
	Date edob;
	Date edoj;
	Date edol;
	int salary;
	//int deptid;
	String designation;
	int IRMId;
	String projected;
	//int baselocationid;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Projectid")
	Project project;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "baselocationid")
	BaseLocationName objbaselocationname;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "deptid")
	Department department;



	public BaseLocationName getObjbaselocationname() {
		return objbaselocationname;
	}
	public void setObjbaselocationname(BaseLocationName objbaselocationname) {
		this.objbaselocationname = objbaselocationname;
	}
	

	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public int getEmpid() 
	{
		return empid;
	}
	public void setEmpid(int empid) 
	{
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public Date getEdob() {
		return edob;
	}
	public void setEdob(Date edob) {
		this.edob = edob;
	}
	public Date getEdoj() {
		return edoj;
	}
	public void setEdoj(Date edoj) {
		this.edoj = edoj;
	}
	public Date getEdol() {
		return edol;
	}
	public void setEdol(Date edol) {
		this.edol = edol;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
//	public int getDeptid() {
//		return deptid;
//	}
//	public void setDeptid(int deptid) {
//		this.deptid = deptid;
//	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getIRMId() {
		return IRMId;
	}
	public void setIRMId(int iRMId) {
		IRMId = iRMId;
	}
	public String getProjected() {
		return projected;
	}
	public void setProjected(String projected) {
		this.projected = projected;
	}
//	public int getBaselocationid() {
//		return baselocationid;
//	}
//	public void setBaselocationid(int baselocationid) {
//		this.baselocationid = baselocationid;
//	}


	
}
