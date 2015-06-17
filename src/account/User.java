package account;

public class User {
	int id;
	String name;
	String password;
	String mobile;

	public User(int id, String name, String password, String mobile){
		this.id = id;
		this.name = name;
		this.password = password;
		this.mobile = mobile;
	}
	
	public String toString(){
		return id + " " + name + " " + password + " " + mobile;
	}
}
