package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.model.CombineClass;

public class CombineClassDao 
{
	JdbcTemplate combineTemplete;
	
	
	public void setCombineTemplete(JdbcTemplate combineTemplete)
	{
		this.combineTemplete = combineTemplete;
	}
	
	public List<CombineClass> getComnineResult()
	{
		return combineTemplete.query("select classs.classid,classs.classname, classs.sectionname,student.sid,student.sname,result.maths,result.hindi,result.english,"
				+ "	result.science,result.sanskrit from result JOIN student on student.sid=result.sid join classs on "
				+ "	student.sclassid=classs.classid;",new RowMapper<CombineClass>()
	
			{
 
        @Override
			public CombineClass mapRow(ResultSet rs, int rowNum) throws SQLException 
           {
        	CombineClass rb= new CombineClass();
        	rb.setClassid(rs.getInt("classid"));
        	rb.setClassname(rs.getString("classname"));
        	rb.setSectionname(rs.getString("sectionname"));
        	rb.setSid(rs.getInt("sid"));
        	rb.setSname(rs.getString("sname"));
        	rb.setMaths(rs.getInt("maths"));
        	rb.setHindi(rs.getInt("hindi"));
        	rb.setEnglish(rs.getInt("english"));
        	rb.setScience(rs.getInt("science"));
        	rb.setSanskrit(rs.getInt("sanskrit"));
			return rb;	
				
			}
      });

	}
}
