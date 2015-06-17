package account;

public class Supplier {
	int id;
	String name;
	String mobile;
	int debtToPay;
	
	public Supplier(int id, String name, String mobile, int debtToPay){
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.debtToPay = debtToPay;
	}
	
	public String toString(){
		return id + " " + name + " " + mobile + " " + debtToPay;
	}
}
