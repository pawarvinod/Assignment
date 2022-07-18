package com.yash.model;

public class CombineClass {
	
//	select classs.classid, classs.sectionname,student.sid,student.sname,result.maths,result.hindi,result.english,
//	result.science,result.sanskrit from result JOIN student on student.sid=result.sid join classs on 
//	student.sclassid=classs.classid;
	int classid;
	String sectionname;
	int sid;
	String classname;
	String sname;
	int maths;
	int hindi;
	int english;
	int science;
	int sanskrit;
	
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getSectionname() {
		return sectionname;
	}
	public void setSectionname(String sectionname) {
		this.sectionname = sectionname;
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
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSanskrit() {
		return sanskrit;
	}
	public void setSanskrit(int sanskrit) {
		this.sanskrit = sanskrit;
	}
	
}
