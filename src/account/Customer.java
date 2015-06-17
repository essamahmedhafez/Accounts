package account;

public class Customer {
	int id;
	String name;
	String mobile;
	String debtToCollect;
	public Customer(int id, String name, String mobile, String debtToCollect){
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.debtToCollect = debtToCollect;
	}
}
