package com.yash.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class BaseLocationName 
{
	@Id
	int  baselocationid;
	String baseLocationName;
	
	@OneToMany(mappedBy = "objbaselocationname", cascade = CascadeType.ALL)
	List<Employee> employee;
	
	
	
	
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public int getBaselocationid() {
		return baselocationid;
	}
	public void setBaselocationid(int baselocationid) {
		this.baselocationid = baselocationid;
	}
	public String getBaseLocationName() {
		return baseLocationName;
	}
	public void setBaseLocationName(String baseLocationName) {
		this.baseLocationName = baseLocationName;
	}
	
	

}
