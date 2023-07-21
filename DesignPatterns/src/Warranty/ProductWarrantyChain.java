package Warranty;
import modelo.Product;
public interface ProductWarrantyChain {
	public void setNextChain(ProductWarrantyChain nextChain);
	
	public void proceed(Product e);
	
}
