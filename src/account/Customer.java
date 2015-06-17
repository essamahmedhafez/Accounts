package account;

public class Customer {
	int id;
	String name;
	String mobile;
	int debtToCollect;
	
	public Customer(int id, String name, String mobile, int debtToCollect){
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.debtToCollect = debtToCollect;
	}
	
	public String toString(){
		return id + " " + name + " " + mobile + " " + debtToCollect;
	}
}
