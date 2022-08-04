package com.yash.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.model.Customer;

public class CustermerDao
{
	
	JdbcTemplate custemplete;

	public void setCustemplete(JdbcTemplate custemplete)
	{
		this.custemplete = custemplete;
	}


	public int intserCustomer(Customer ct)
	{
		
		String quiry="insert into customer(customerid,customername,email,dob,add1,add2,pincode)values("+ct.getCustomerid()+",'"+ct.getCustomername()+"','"+ct.getEmail()+"','"+ct.getDob()+"','"+ct.getAdd1()+"','"+ct.getAdd2()+"',"+ct.getPincode()+")";
		return custemplete.update(quiry);
		
	}
	public List<Customer> getCustomer()
	{
		return custemplete.query("select * from customer",new RowMapper<Customer>()
	
			{
 
        public Customer mapRow(ResultSet rs, int rowNum) throws SQLException 
           {
           
        	Customer re= new Customer();
				re.setCustomerid(rs.getInt("customerid"));
				re.setCustomername(rs.getString("customername"));
				re.setEmail(rs.getString("email"));
				re.setDob(rs.getDate("dob"));
				re.setAdd1(rs.getString("add1"));
				re.setAdd2(rs.getNString("add2"));
				re.setPincode(rs.getInt("pincode"));
			
				  return re;	
				
			}
      });
	}
	//select * from customer where customerid=201
	public List<Customer> getPurchaseDate()
	{
		return custemplete.query("select * from customer where customerid=201",new RowMapper<Customer>()
	
			{
 
        public Customer mapRow(ResultSet rs, int rowNum) throws SQLException 
           {
           
        	Customer re= new Customer();
				re.setCustomerid(rs.getInt("customerid"));
				re.setCustomername(rs.getString("customername"));
				re.setEmail(rs.getString("email"));
				re.setDob(rs.getDate("dob"));
				re.setAdd1(rs.getString("add1"));
				re.setAdd2(rs.getNString("add2"));
				re.setPincode(rs.getInt("pincode"));
			
				  return re;	
				
			}
      });
	}
	
	public List<Customer> getmorethanAvgBill()
    {
        return custemplete.query("select * from customer inner join bill on bill.customerid = customer.customerid join billitem on bill.billid=billitem.billid where price >(select AVG(price) from billitem)",new RowMapper<Customer>()
         {
              public Customer mapRow(ResultSet rs, int row) throws SQLException
              {

                  Customer obj= new Customer();
                  obj.setCustomerid(rs.getInt("customerid"));
                  obj.setCustomername(rs.getString("customername"));
                  obj.setEmail(rs.getString("email"));
                  obj.setDob(rs.getDate("dob"));
                  return obj;
              }
         });

}

}