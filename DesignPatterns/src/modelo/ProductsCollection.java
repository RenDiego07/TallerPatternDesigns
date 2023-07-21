package modelo;

import java.util.List;

public interface ProductsCollection {
	public Iterator createIteratorWeb();	
	public Iterator createIteratorRetailer(String store);
	public Iterator createIteratorSupplier();
}
