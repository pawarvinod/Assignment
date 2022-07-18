package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.model.CombineClass;
import com.yash.model.Result;
import com.yash.model.Student;

public class ResultDao {
	
	JdbcTemplate objrjdbc;

	public void setObjrjdbc(JdbcTemplate objrjdbc) {
		this.objrjdbc = objrjdbc;
	}
	
	public int  insertResult(Result objres)
	{
		
		String quaryres="insert into result(rid,maths,hindi,english,science,sanskrit,sid,datetime)values("+objres.getRid()+","+objres.getMaths()+","+objres.getHindi()+","+objres.getScience()+","+ objres.getEnglish()+","+objres.getSanskrit()+","+objres.getSid()+",'"+objres.getDatetime()+"')";
		return objrjdbc.update(quaryres);
		
	}
	
	public List<Result> getResult()
	{
		return objrjdbc.query("select * from result",new RowMapper<Result>()
	
			{
 
        @Override
			public Result mapRow(ResultSet rs, int rowNum) throws SQLException 
           {
				Result re= new Result();
				re.setRid(rs.getInt("rid"));
				re.setEnglish(rs.getInt("english"));
				re.setHindi(rs.getInt("hindi"));
				re.setMaths(rs.getInt("maths"));
				re.setSanskrit(rs.getInt("sanskrit"));
				re.setScience(rs.getInt("science"));
				re.setSid(rs.getInt("sid"));
				  return re;	
				
			}
      });
		
}
}
