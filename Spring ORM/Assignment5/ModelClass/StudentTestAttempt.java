package com.yash.modul;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class StudentTestAttempt 
{
	@Id
	int staid;
//	int studentid;
//	int qid;
	String markedAnswer;
	
	@ManyToOne
	TestQustion test_q;//ok
	
	@ManyToOne
	Student student;//ok
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public TestQustion getTest_q() {
		return test_q;
	}
	public void setTest_q(TestQustion test_q) {
		this.test_q = test_q;
	}
	public int getStaid() {
		return staid;
	}
	public void setStaid(int staid) {
		this.staid = staid;
	}
//	public int getStudentid() {
//		return studentid;
//	}
//	public void setStudentid(int studentid) {
//		this.studentid = studentid;
//	}
//	public int getQid() {
//		return qid;
//	}
//	public void setQid(int qid) {
//		this.qid = qid;
//	}
	public String getMarkedAnswer() {
		return markedAnswer;
	}
	public void setMarkedAnswer(String markedAnswer) {
		this.markedAnswer = markedAnswer;
	}
	
	
	

}
