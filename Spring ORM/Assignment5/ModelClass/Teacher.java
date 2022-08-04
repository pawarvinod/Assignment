package com.yash.modul;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher
{
	@Id
	int techerid;
	String teachername;
	String email;
	int password;
	
//	@OneToMany(mappedBy="teacher") //ok//q1 2 
	//teacher -> test 1-10  test-> teacher 10-1
	//test -> test quew 1-10 -><-
	
	@OneToMany(mappedBy = "teacher")//ok
	List<Test> test;
	
	
	public List<Test> getTest() {
		return test;
	}
	public void setTest(List<Test> test) {
		this.test = test;
	}
	public int getTecherid() {
		return techerid;
	}
	public void setTecherid(int techerid) {
		this.techerid = techerid;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername)
	{
		this.teachername = teachername;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password)
	{
		this.password = password;
	}
		
}
