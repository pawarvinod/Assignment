package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.model.Category;
import com.yash.model.SubCatgory;

public class SubCategoryDao {
	
	JdbcTemplate subcattemple;


	public void setSubcattemple(JdbcTemplate subcattemple) 
	{
		this.subcattemple = subcattemple;
	}
	
	public int getsubcategory(SubCatgory subcat)
	{
		String quary="insert into subcatgory(subcatid,catid,subcarname)values("+subcat.getCatid()+","+subcat.getSubcatid()+",'"+subcat.getSubcatname()+"')";
		return subcattemple.update(quary);
	}

	public List<SubCatgory> getSubCategory()
	{
	return	subcattemple.query("select * from subcatgory", new RowMapper<SubCatgory>()
			
			{
			public SubCatgory mapRow(ResultSet rs,int rownum) throws SQLException
			{
				SubCatgory sub=new SubCatgory();
				sub.setCatid(rs.getInt("catid"));
				sub.setSubcatid(rs.getInt("subcatid"));
				sub.setSubcatname(rs.getNString("subcarname"));
				return sub;
				
			 }
			}
			
			);
	
	}

//	public List<SubCatgory> getSubCatList() 
//	{
//		return	subcattemple.query("select * from subcatgory catid="+ new RowMapper<SubCatgory>()
//		
//		{
//		public SubCatgory mapRow(ResultSet rs,int rownum) throws SQLException
//		{
//			SubCatgory sub=new SubCatgory();
//			sub.setCatid(rs.getInt("catid"));
//			sub.setSubcatid(rs.getInt("subcatid"));
//			sub.setSubcatname(rs.getNString("subcarname"));
//			return sub;
//			
//		 }
//		}
//		
//		);
		
//	}
}
