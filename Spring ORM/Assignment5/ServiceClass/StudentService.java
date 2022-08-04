package com.yash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.modul.Student;
import com.yash.repository.StudentRepo;

@Service
public class StudentService
{
	@Autowired
	StudentRepo strepo;
   public List<Student> getListOfStudent()
	{
		
	return strepo.findAll();
	}
   public Student saveListOfStudent()
   {
	   Student st= new Student();
	   st.setSid(3);
	   st.setSname("santosh");
	   st.setEmail("santosh@643");
	   st.setPassword(45643);
	   return strepo.save(st);
   }
	

}
