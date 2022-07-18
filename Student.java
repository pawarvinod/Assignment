package com.yash.model;

import java.sql.Date;

//1) WAP to perform following operation on Student, Result, and Class tables. 
	//Student table :- sid, sname, father_name, mother_name, classid, add1, add2, pincode, 
	//aadharno, dob, date_of_admission.
	//Class:- classid, classname, sectionname.
	//Result:- rid, Maths, Hindi,English, science, Sanskrit, sid, datetime.


public class Student
{
	int sid;
	String sname;
	String sfathername;
	String smothername;
	String sclassid;
	String sadd1;
	String sadd2;
	int  spincode;
	int sadharno;
	Date sdob;
	Date sdoa;
	
	public int getSadharno() {
		return sadharno;
	}
	public void setSadharno(int sadharno) {
		this.sadharno = sadharno;
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
	public String getSfathername() {
		return sfathername;
	}
	public void setSfathername(String sfathername) {
		this.sfathername = sfathername;
	}
	public String getSmothername() {
		return smothername;
	}
	public void setSmothername(String smothername) {
		this.smothername = smothername;
	}
	public String getSclassid() {
		return sclassid;
	}
	public void setSclassid(String sclassid) {
		this.sclassid = sclassid;
	}
	public String getSadd1() {
		return sadd1;
	}
	public void setSadd1(String sadd1) {
		this.sadd1 = sadd1;
	}
	public String getSadd2() {
		return sadd2;
	}
	public void setSadd2(String sadd2) {
		this.sadd2 = sadd2;
	}
	public int getSpincode() {
		return spincode;
	}
	public void setSpincode(int spincode) {
		this.spincode = spincode;
	}
	
	public Date getSdob() {
		return sdob;
	}
	public void setSdob(Date sdob) {
		this.sdob = sdob;
	}
	public Date getSdoa() {
		return sdoa;
	}
	public void setSdoa(Date sdoa) {
		this.sdoa = sdoa;
	}
	

}
