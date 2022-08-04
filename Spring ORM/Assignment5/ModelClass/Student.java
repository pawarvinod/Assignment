package com.yash.modul;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student 
{

	@Id
	int sid;
	String sname; 
	String email;
	int password;
	
	@OneToMany (mappedBy = "student")
	List<StudentTestAttempt> attempt;//ok
	
	
	public List<StudentTestAttempt> getAttempt() {
		return attempt;
	}
	public void setAttempt(List<StudentTestAttempt> attempt) {
		this.attempt = attempt;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
}
