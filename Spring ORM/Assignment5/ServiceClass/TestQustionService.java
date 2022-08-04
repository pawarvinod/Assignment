package com.yash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.modul.Teacher;
import com.yash.modul.TestQustion;
import com.yash.repository.TestQuestionTRepo;

@Service
public class TestQustionService
{
	@Autowired
	TestQuestionTRepo tqrepo;
	
	 public TestQustion saveListOfQustion()
	 {
		 TestQustion tq=new TestQustion();
		 tq.setQid(14);
		 tq.setTestid(911);
		 tq.setQuestion("What is the notice period in Yash Technologies??");
		 tq.setAnswer1("3 month");
		 tq.setAnswer2("4 month");
		 tq.setAnswer3("2 month");
		 tq.setAnswer4("15 days");
		 tq.setCorrectanswer("3 month");
		return tqrepo.save(tq);
		 
	 }
	 public List<TestQustion> getListOfTestQustion()
	 {
		 return tqrepo.findAll();
	 }
	public Optional<TestQustion> findById(int qid) 
	{
		return tqrepo.findById(qid);
		
	}
	public Optional<TestQustion> getQuestionById(int qid)
	{
		
		return tqrepo.findById(qid);
	}

}
