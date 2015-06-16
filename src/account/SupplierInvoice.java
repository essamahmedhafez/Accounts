package account;

public class SupplierInvoice {
	int id;
	Supplier supplier;
	Product[] products;
	int countProducts;
	int totalCost;
	int paid;
	int rest; //totalCost - paid
}
