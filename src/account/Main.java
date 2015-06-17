package account;

import java.io.BufferedReader;
import java.io.File;
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
			System.out.println(users[i]);		
		}
		for(int i=0;i<customers.length;i++){
			System.out.println(customers[i]);		
		}
		for(int i=0;i<suppliers.length;i++){
			System.out.println(suppliers[i]);		
		}
	}
	
	public static void storeDB(){
		
	}
	
	public static void loadDB(){		
		boolean usersLoaded = loadUsers();
		boolean customersLoaded = loadCustomers();
		boolean suppliersLoaded = loadSuppliers();
		if(!usersLoaded){
			System.out.println("error in validating users count");
		}
		if(!customersLoaded){
			System.out.println("error in validating Customers count");
		}
	}
	
	
	public static boolean loadUsers(){
		String [] validation = readFile("validateData.txt");
		int nUsers = 0;
		for(int i=0;i<validation.length;i++){
			if(validation[i].split(" ")[0].compareTo("users") == 0){
				nUsers = Integer.parseInt(validation[i].split(" ")[1]);
			}
		}
		String [] loadedUsers = readFile("users.txt");
		users = new User[loadedUsers.length];
		for(int i=0;i<users.length;i++){
			if(loadedUsers[i].split(" ").length == 4){
				users[i]= new User(Integer.parseInt(loadedUsers[i].split(" ")[0]), loadedUsers[i].split(" ")[1], loadedUsers[i].split(" ")[2], loadedUsers[i].split(" ")[3]);
			}else{
				System.out.println("user " + loadedUsers[i] + " couldnt be loaded.");
			}
		}
		if(users.length == nUsers){
			return true;
		}else{
			return false;
		}	
	}
	
	public static boolean loadCustomers(){
		String [] validation = readFile("validateData.txt");
		int nCustomers = 0;
		for(int i=0;i<validation.length;i++){
			if(validation[i].split(" ")[0].compareTo("customers") == 0){
				nCustomers = Integer.parseInt(validation[i].split(" ")[1]);
			}
		}
		String [] loadedCustomers = readFile("customers.txt");
		customers = new Customer[loadedCustomers.length];
		for(int i=0;i<customers.length;i++){
			if(loadedCustomers[i].split(" ").length == 4){
				customers[i]= new Customer(Integer.parseInt(loadedCustomers[i].split(" ")[0]), loadedCustomers[i].split(" ")[1], loadedCustomers[i].split(" ")[2], Integer.parseInt(loadedCustomers[i].split(" ")[3]));
			}else{
				System.out.println("Customer " + loadedCustomers[i] + " couldnt be loaded.");
			}
		}
		if(customers.length == nCustomers){
			return true;
		}else{
			return false;
		}	
	}
	
	public static boolean loadSuppliers(){
		String [] validation = readFile("validateData.txt");
		int nsuppliers = 0;
		for(int i=0;i<validation.length;i++){
			if(validation[i].split(" ")[0].compareTo("suppliers") == 0){
				nsuppliers = Integer.parseInt(validation[i].split(" ")[1]);
			}
		}
		String [] loadedSuppliers = readFile("suppliers.txt");
		suppliers = new Supplier[loadedSuppliers.length];
		for(int i=0;i<suppliers.length;i++){
			if(loadedSuppliers[i].split(" ").length == 4){
				suppliers[i]= new Supplier(Integer.parseInt(loadedSuppliers[i].split(" ")[0]), loadedSuppliers[i].split(" ")[1], loadedSuppliers[i].split(" ")[2], Integer.parseInt(loadedSuppliers[i].split(" ")[3]));
			}else{
				System.out.println("Customer " + loadedSuppliers[i] + " couldnt be loaded.");
			}
		}
		if(suppliers.length == nsuppliers){
			return true;
		}else{
			return false;
		}	
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
