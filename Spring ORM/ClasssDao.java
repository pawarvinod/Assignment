package com.yash.dao;
import org.springframework.jdbc.core.JdbcTemplate;

import com.yash.model.Classs;

public class ClasssDao 
{
	JdbcTemplate objcjdbc;

	public void setObjcjdbc(JdbcTemplate objcjdbc) 
	{
		this.objcjdbc = objcjdbc;
	}
	public int insertClasss(Classs objcl)
	{

	String quaryres="insert into classs "
			+"(classid,classname,sectionname)"
			+ "values("+objcl.getClassid()+",'"+objcl.getClassname()+"','"+objcl.getSectionname()+"')";
	return objcjdbc.update(quaryres);
}
	
}
