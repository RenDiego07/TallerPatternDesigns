package Warranty;
import modelo.Product;
public class StoreManagerHandler implements ProductWarrantyChain {
	ProductWarrantyChain nextChain;
	public void setNextChain(ProductWarrantyChain nextChain) {
		nextChain = nextChain;
	}
	public void proceed(Product e) {
		// el gerente de la tienda lo aprueba
		if(true) {
			System.out.println("su reembolso llegara dd//mm/yy");
		}else{
			System.out.println("lo sentimos");
		}
		
	}
}
