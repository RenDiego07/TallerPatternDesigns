package src.modelo;

import java.util.List;

public class Products implements ProductsCollection {
	List<Product> allProducts = Database.getProducts();

	@Override
	public Iterator createIteratorWeb() {
		return new ProductIterator(this.getAvailableProducts());
	}

	@Override
	public Iterator createIteratorSupplier() {
		return new ProductIterator(this.getBrokenProducts());
	}

	@Override
	public Iterator createIteratorRetailer(String store) {
		return new ProductIterator(this.getProductsFrom(store));
	}

}
