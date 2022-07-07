package Assignment12;

public class Assi12Student 
{

	String sstudentName;
	int srollNo;
	String sdob;
	String sclassName;
	
	
	
	
	public String getSstudentName() {
		return sstudentName;
	}
	public void setSstudentName(String sstudentName) {
		this.sstudentName = sstudentName;
	}
	public int getSrollNo() {
		return srollNo;
	}
	public void setSrollNo(int srollNo) {
		this.srollNo = srollNo;
	}
	public String getSdob() {
		return sdob;
	}
	public void setSdob(String sdob) {
		this.sdob = sdob;
	}
	public String getSclassName() {
		return sclassName;
	}
	public void setSclassName(String sclassName) {
		this.sclassName = sclassName;
	}
	public Assi12Student() {
		// TODO Auto-generated constructor stub
	}
	public Assi12Student(String sstudentName, int srollNo, String sdob, String sclassName) {
		super();
		this.sstudentName = sstudentName;
		this.srollNo = srollNo;
		this.sdob = sdob;
		this.sclassName = sclassName;
		
	}
	
	
}
