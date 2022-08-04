package com.yash.dao;

import java.sql.Date;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yash.model.Bill;

public class BillDao
{

	JdbcTemplate billtemplete;


	public void setBilltemplete(JdbcTemplate billtemplete)
	{
		this.billtemplete = billtemplete;
	}
	
	public int insertBill(Bill bl)
	{
		String quarys="insert into bill(billid,customerid,dateifbill)values("+bl.getBillid()+","+bl.getCustomerid()+",'"+bl.getDateifbill()+"')";
		return billtemplete.update(quarys);
	}
	
	
	
}
