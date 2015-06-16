package account;

public class CustomerInvoice {
	int id;
	Customer customer;
	Product[] products;
	int countProducts;
	int totalCost;
	int totalPrice;
	int profit; //totalprice - total cost
	int paid;
	int rest; //total price - paid
}
