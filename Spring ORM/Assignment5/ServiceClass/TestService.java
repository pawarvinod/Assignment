package com.yash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.modul.Test;
import com.yash.repository.TestRepo;

@Service
public class TestService
{
//
//	int testid;
//	String testname;
//	int teacherid;
	
	@Autowired
	TestRepo testrepo;
	
	public List<Test> getListOfTestService()
    {
		
        return testrepo.findAll();
    }
	public Test savelistOfTestP(Test t1)
	{
		return testrepo.save(t1);
	}
//  public Test saveListOfTest()
//	{
//	
//	  Test t = new Test();
//	  t.setTestid(113);
//	  t.setTestname("TDD");
//	  return testrepo.save(t);
//	}

}
