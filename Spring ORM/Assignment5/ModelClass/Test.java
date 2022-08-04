package com.yash.modul;

import java.util.List;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Test
{
	@Id
	int testid;
	String testname;
	int teacherid;
	
	@ManyToOne
	Teacher teacher;//ok
	
	@OneToMany(mappedBy="test")
	List<TestQustion> tq;
	
	
	
	public List<TestQustion> getTq() {
		return tq;
	}
	public void setTq(List<TestQustion> tq) {
		this.tq = tq;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public int getTestid() {
		return testid;
	}
	public void setTestid(int testid) {
		this.testid = testid;
	}
	public String getTestname() {
		return testname;
	}
	public void setTestname(String testname) {
		this.testname = testname;
	}

}
