package Warranty;
import java.util.Date;
import modelo.Product;
public class ProductWarrantyManagment {
	
	
	
	public static boolean isActiveWarranty(Date date1, Date date2) {
		// si la fecha1 es menor a la fecha2 entonces devuele true;
		// caso contrario devuelve false
		return true;
	}
	public static boolean damagedCovered(String tipo) {
		
		// verifica si el tipo de fallo del producto es cubierto por la garantia
		return true;
	}
	public static boolean isInStock(Product e) {
		// verifica si el producto se encuentra en stock para poder realizar el reembolso al cliente
		return true;
	}
}
