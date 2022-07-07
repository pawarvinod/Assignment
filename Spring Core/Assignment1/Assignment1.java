package Com.Spring;

public class Assignment1 {
	int aid;
	String aName;
	String askil;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getAskil() {
		return askil;
	}
	public void setAskil(String askil) {
		this.askil = askil;
	}
	public void showInfo() {
	System.out.println("id number : "+aid);
	System.out.println("id name   : " +aName);
	System.out.println("id number : " +askil);
	

   }
}
