package account;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Main {
	
	static User[] users;	
	static Product[] products;
	static Warehouse[] warehouses;
	static Customer[] customers;
	static Supplier[] suppliers;
	static CustomerInvoice[] customerInvoices;
	static SupplierInvoice[] supplierInvoices;
	
	public static void main(String[] args){
		loadDB();
		for(int i=0;i<users.length;i++){
			System.out.println(users[i].name);
		}
	}
	
	public static void storeDB(){
		
	}
	
	public static void loadDB(){
		boolean usersLoaded = loadUsers();
	}
	
	public static boolean loadUsers(){
		String [] loadedUsers = readFile("users.txt");
		users = new User[loadedUsers.length];
		for(int i=0;i<users.length;i++){
			users[i]= new User(Integer.parseInt(loadedUsers[i].split(" ")[0]), loadedUsers[i].split(" ")[1], loadedUsers[i].split(" ")[2], loadedUsers[i].split(" ")[3]);			
		}
		return true;
	}
	
	public static  String[] readFile(String filename){
		BufferedReader br = null;
		LinkedList<String> fileReaded = new LinkedList<String>();;
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader(filename));
 
			while ((sCurrentLine = br.readLine()) != null) {
				fileReaded.add(sCurrentLine);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		Object [] returnedObject = fileReaded.toArray();
		String [] returnedFile = new String[returnedObject.length];
		for(int i=0;i<returnedFile.length;i++){
			returnedFile[i] = (String) returnedObject[i];
		}
		return returnedFile;
		
	}
	
}
