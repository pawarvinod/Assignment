package com.yash.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Project 
{

	@Id
	int  Projectid;
	String projectname;
	int promempid;
	
	@OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
	List<Employee> employee;
	
	
	
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public int getPromempid() {
		return promempid;
	}
	public void setPromempid(int promempid) {
		this.promempid = promempid;
	}
	public int getProjectid() {
		return Projectid;
	}
	public void setProjectid(int projectid) {
		Projectid = projectid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	
	
	
}
