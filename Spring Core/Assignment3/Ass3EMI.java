package Assignment3;

public class Ass3EMI
{
	int amount;
	int year;
	int roi;//xml 
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getRoi() {
		return roi;
	}
	public void setRoi(int roi) {
		this.roi = roi;
	}
	
	
	public void interrest()
	{
		
		double total= getAmount() * getRoi()/100 * getYear();
        double totalamount= amount + total;
        double emi=totalamount/(getYear()*12);
        int totalemi=getYear()*12;
        System.out.println("Amount per Emi:- "+emi);
        System.out.println("Total no of EMI:- "+totalemi);
	}

}
