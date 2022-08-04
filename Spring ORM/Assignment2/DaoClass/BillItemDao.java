package com.yash.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yash.model.BillItem;

public class BillItemDao 
{

	JdbcTemplate billItemTemplete;


	public void setBillItemTemplete(JdbcTemplate billItemTemplete) 
	{
		this.billItemTemplete = billItemTemplete;
	}
	public int insertBillItem(BillItem bitem)
	{
		
		String squary="insert into billitem(biid,billid,itemid,qty,price)values("+bitem.getBiid()+","+bitem.getBillid()+","+bitem.getItemid()+","+bitem.getQty()+","+bitem.getPrice()+")";
		return billItemTemplete.update(squary);
	}

}
