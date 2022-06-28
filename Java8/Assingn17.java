package Assignment17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

 class Assingn17 {
	String eName;
	LocalDate eDob;
	LocalDate eDoj;
	LocalDate eDor;
	String eLocatioin;
	String eDepartment;
	long eSalary;
	
	public Assingn17() {
		// TODO Auto-generated constructor stub
	}
	public Assingn17(String eName, LocalDate eDob, LocalDate eDoj, LocalDate eDor, String eLocatioin,
			String eDepartment, long eSalary) {
		super();
		this.eName = eName;
		this.eDob = eDob;
		this.eDoj = eDoj;
		this.eDor = eDor;
		this.eLocatioin = eLocatioin;
		this.eDepartment = eDepartment;
		this.eSalary = eSalary;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public LocalDate geteDob() {
		return eDob;
	}
	public void seteDob(LocalDate eDob) {
		this.eDob = eDob;
	}
	public LocalDate geteDoj() {
		return eDoj;
	}
	public void seteDoj(LocalDate eDoj) {
		this.eDoj = eDoj;
	}
	public LocalDate geteDor() {
		return eDor;
	}
	public void seteDor(LocalDate eDor) {
		this.eDor = eDor;
	}
	public String geteLocatioin() {
		return eLocatioin;
	}
	public void seteLocatioin(String eLocatioin) {
		this.eLocatioin = eLocatioin;
	}
	public String geteDepartment() {
		return eDepartment;
	}
	public void seteDepartment(String eDepartment) {
		this.eDepartment = eDepartment;
	}
	public long geteSalary() {
		return eSalary;
	}
	public void seteSalary(long eSalary) {
		this.eSalary = eSalary;
	}
	
	
 }


