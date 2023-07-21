package Warranty;
import modelo.Product;
public class Customer {
	private String name;
	private String id;
	private Product damagedProduct;
	public Customer(String name, String id) {
		this.name = name;
		this.id = id;
	}
	public static void Garantia() {
		Handler d = new CustomerServiceHandler();
		Handler d1 = new TecnicalServiceHandler();
		Handler d3 = new StoreManagerHandler();
		Handler d2 = new InventoryManagerHandler();
		d1.setNextChain(d2);
		d2.setNextChain(d3);
		
	}
	
	
	
	
}
