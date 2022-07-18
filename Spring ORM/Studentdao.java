package com.yash.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.yash.model.Student;
public class Studentdao
{
	
	JdbcTemplate objjdbc;
	
	
	public void setObjjdbc(JdbcTemplate objjdbc) 
	{
		this.objjdbc = objjdbc;
	}

	
	public int  insert(Student obj)
	{
		
		String quary="insert into student "
				+"(sid,sname,sfathername,smothername,sclassid,sadd1,sadd2,spincode,sadharno,sdob,sdoa)"// 
				+ "values("+obj.getSid()+",'"+obj.getSname()+"','"+obj.getSfathername()+"','"+obj.getSmothername()+"','"+
				obj.getSclassid()+"','"+obj.getSadd1()+"','"+obj.getSadd2()+"','"+obj.getSpincode()+"','"+
				obj.getSadharno()+"','"+obj.getSdob()+"','"+obj.getSdoa()+"')";
		return objjdbc.update(quary);
		
	}

	
	public List<Student> getResultJoin()
    {
         return objjdbc.query("select * from student",new RowMapper<Student>()
         {
           @Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException 
              {
				Student st= new Student();
				st.setSid(rs.getInt("sid"));
				st.setSname(rs.getString("sname"));
				st.setSfathername(rs.getString("sfathername"));
				st.setSmothername(rs.getString("smothername"));
				st.setSclassid(rs.getNString("sclassid"))
				;
				st.setSadd1(rs.getString("sadd1"));
				st.setSadd2(rs.getString("sadd2"));
				st.setSpincode(rs.getInt("spincode"));
				st.setSadharno(rs.getInt("sadharno"));
				st.setSdoa(rs.getDate("sdob"));;
				st.setSdoa(rs.getDate("sdoa"));
				
				
				  return st;
			}
         });
         
    }


	public List<Student> getId(int id) 
	{
	
		 return objjdbc.query("select * from student where sid="+id,new RowMapper<Student>()
         {
           @Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException 
              {
				Student st= new Student();
				st.setSid(rs.getInt("sid"));
				st.setSname(rs.getString("sname"));
				st.setSfathername(rs.getString("sfathername"));
				st.setSmothername(rs.getString("smothername"));
				st.setSclassid(rs.getNString("sclassid"));
				st.setSadd1(rs.getString("sadd1"));
				st.setSadd2(rs.getString("sadd2"));
				st.setSpincode(rs.getInt("spincode"));
				st.setSadharno(rs.getInt("sadharno"));
				st.setSdoa(rs.getDate("sdob"));;
				st.setSdoa(rs.getDate("sdoa"));
				
				
				  return st;
			}
         });
	
	}

	
}