package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.yash.model.Category;
public class CategoryDao {
	
	JdbcTemplate categorytemplete;


	public void setCategorytemplete(JdbcTemplate categorytemplete)
	{
		this.categorytemplete = categorytemplete;
	}
	
	public int insertCategory(Category cat)
	{
		
		String qcat="insert into category(catid,catname)values("+cat.getCatid()+",'"+cat.getCatname()+"')";
		return categorytemplete.update(qcat);
	}
	public List<Category> getCategoary()
	{
		return categorytemplete.query("select * from category",new RowMapper<Category>()

			{
 
        @Override
			public Category mapRow(ResultSet rs, int rowNum) throws SQLException 
           {
           
        	Category re = new Category();
       
				re.setCatid(rs.getInt("catid"));
				re.setCatname(rs.getString("catname"));
				return re;
				
			}
      });
	}
}
