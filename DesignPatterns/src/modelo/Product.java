package modelo;
import java.util.Date;
public class Product {
	private String name;
	private int id;
	private double price;
	private boolean disponibility;
	private boolean broken;
	private Date warrantyPeriod;
	private String brokenType;
	public Product() {
		
	};
	public Product(double price, String name) {
		this.price = price;
		this.name = name;
	}

	public double getPrice() {
		return price;
	}
	public Date getWarrantyPeriod() {
		return warrantyPeriod;
	}
	public String brokenType() {
		return this.brokenType;
	}
	
	
	
}
