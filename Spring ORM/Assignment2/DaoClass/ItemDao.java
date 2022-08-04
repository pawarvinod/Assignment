package com.yash.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.model.Item;

public class ItemDao
{

	JdbcTemplate itemtemplete;

	public void setItemtemplete(JdbcTemplate itemtemplete)
	{
		this.itemtemplete = itemtemplete;
	}
	public int intseritem(Item it)
	{
		
		String quiry="insert into item(itemid,iname,subcatid,price,dom,doe,instock,discount)values("+it.getItemid()+",'"+it.getIname()+"',"+it.getSubcatid()+","+it.getPrice()+",'"+it.getDom()+"','"+it.getDoe()+"','"+it.getInstock()+"',"+it.getDiscount()+")";
		return itemtemplete.update(quiry);
		
	}
	public List<Item> getItem()
	{
		return itemtemplete.query("select * from item",new RowMapper<Item>()
	
			{
 
        @Override
			public Item mapRow(ResultSet rs, int rowNum) throws SQLException 
           {
           
        	   Item re= new Item();
				re.setItemid(rs.getInt("itemid"));
				re.setIname(rs.getString("iname"));
				re.setSubcatid(rs.getInt("subcatid"));
				re.setPrice(rs.getInt("price"));
				re.setDom(rs.getDate("dom"));
				re.setDoe(rs.getDate("doe"));
				re.setInstock(rs.getString("instock"));
				re.setDiscount(rs.getInt("discount"));
				  return re;	
				
			}
      });

	}
	public List<Item> getitemOutOfstock()
	{
			return itemtemplete.query("select * from item where instock='no'",new RowMapper<Item>()
				{
	 
	        @Override
				public Item mapRow(ResultSet rs, int rowNum) throws SQLException 
	           {
	           
	        	   Item re= new Item();
					re.setItemid(rs.getInt("itemid"));
					re.setIname(rs.getString("iname"));
					re.setSubcatid(rs.getInt("subcatid"));
					re.setPrice(rs.getInt("price"));
					re.setDom(rs.getDate("dom"));
					re.setDoe(rs.getDate("doe"));
					re.setInstock(rs.getString("instock"));
					re.setDiscount(rs.getInt("discount"));
					  return re;	
					
				}
	      });
	}
			public List<Item> getHightDiscount()
			{
					return itemtemplete.query("select*from item where (select avg(price) from item)<price ",new RowMapper<Item>()
						{
			 
			        @Override
						public Item mapRow(ResultSet rs, int rowNum) throws SQLException 
			           {
			           
			        	   Item re= new Item();
							re.setItemid(rs.getInt("itemid"));
							re.setIname(rs.getString("iname"));
							re.setSubcatid(rs.getInt("subcatid"));
							re.setPrice(rs.getInt("price"));
							re.setDom(rs.getDate("dom"));
							re.setDoe(rs.getDate("doe"));
							re.setInstock(rs.getString("instock"));
							re.setDiscount(rs.getInt("discount"));
							  return re;	
							
						}
			      });
					
	       }
			public List<Item> getLowestSelling()
			{
					return itemtemplete.query("select min(price) from item;",new RowMapper<Item>()
						{
			 
			        @Override
						public Item mapRow(ResultSet rs, int rowNum) throws SQLException 
			           {
			           
			        	   Item re= new Item();
							re.setItemid(rs.getInt("itemid"));
							re.setIname(rs.getString("iname"));
							re.setSubcatid(rs.getInt("subcatid"));
							re.setPrice(rs.getInt("price"));
							re.setDom(rs.getDate("dom"));
							re.setDoe(rs.getDate("doe"));
							re.setInstock(rs.getString("instock"));
							re.setDiscount(rs.getInt("discount"));
							  return re;	
							
						}
			      });
          }
}