package com.yash.model;

import java.sql.Date;

public class Bill {
	
	int  billid;
	int customerid;
	Date dateifbill;
	
	
	public Date getDateifbill() {
		return dateifbill;
	}
	public void setDateifbill(Date dateifbill) {
		this.dateifbill = dateifbill;
	}
	public int getBillid() {
		return billid;
	}
	public void setBillid(int billid) {
		this.billid = billid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
		
	

}
