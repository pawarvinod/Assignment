5package com.yash.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yash.modul.Teacher;
import com.yash.repository.TecherRepo;
@Service
public class TeacherService 
{
	@Autowired
	TecherRepo terepo;
	public Teacher saveListOfTeacher()
	{
		Teacher ta= new Teacher();
		ta.setTecherid(913);
		ta.setTeachername("snehal mam");
		ta.setEmail("snehal@456");
		ta.setPassword(2345);
		return terepo.save(ta);
		
	}
	 public List<Teacher> getListOfTechaer()
		{
			
		return terepo.findAll();
		}
	
}
