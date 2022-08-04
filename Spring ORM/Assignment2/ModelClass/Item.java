package com.yash.model;

import java.sql.Date;

public class Item {
	int itemid;
	String iname;
	int subcatid;
	int price;
	Date dom ;
	Date doe;
	String  instock;
	int discount;
	
	
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getSubcatid() {
		return subcatid;
	}
	public void setSubcatid(int subcatid) {
		this.subcatid = subcatid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getDom() {
		return dom;
	}
	public void setDom(Date dom) {
		this.dom = dom;
	}
	public Date getDoe() {
		return doe;
	}
	public void setDoe(Date doe) {
		this.doe = doe;
	}
	public String getInstock() {
		return instock;
	}
	public void setInstock(String instock) {
		this.instock = instock;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	

}
