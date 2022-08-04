package com.yash.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.modul.StudentTestAttempt;
import com.yash.repository.StudentTestRepo;

@Service
public class StudentTestAttempService
{
//	int staid;
//	String studentid;
//	int qid;
//	String markedAnswer;
	@Autowired
	StudentTestRepo statrepo;
	public StudentTestAttempt saveListOfTestAttempt()
	{
	StudentTestAttempt sta=new StudentTestAttempt();
//	sta.setStaid(304);
//	sta.setStudentid(4);
//	sta.setQid(11);
	sta.setMarkedAnswer("yes");
	return statrepo.save(sta);
	}
	public List<StudentTestAttempt> getListOfTestAttemt()
	{
		return statrepo.findAll();
	}

}
