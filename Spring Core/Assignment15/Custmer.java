package Assignment15;

public class Custmer {
	
	String cName;
	int cid;
	String caddress;
	Assi15Item item;
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public Assi15Item getItem() {
		return item;
	}
	public void setItem(Assi15Item item) {
		this.item = item;
	}
	
	public void purchasedItem()
	{
		System.out.println("Custermer id     : "+getCid());
		System.out.println("Custermer Name   : "+getcName());
		System.out.println("Custermer adress : "+getCaddress());
		System.out.println("Item  id         : "+item.getItemid());
		System.out.println("Item Name        : "+item.getItemName());
		System.out.println("Item Price       : "+item.getItemPrice());
		
	}
	
}
