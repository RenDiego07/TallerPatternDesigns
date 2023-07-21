package modelo;

import java.util.List;

public class ProductIterator implements Iterator{
	private List<Product> products;
	private int currentPosition = 0;
	
	public ProductIterator(List<Product> products) {
		this.products = products;
	}
	
	public boolean hasNext() {
		return currentPosition < products.size() - 1;
	}
	
	public Product getNext() {
		currentPosition++;
		return products.get(currentPosition);
	}
}
