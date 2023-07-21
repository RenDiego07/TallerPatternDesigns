package Warranty;
import modelo.Product;
public class InventoryManagerHandler implements ProductWarrantyChain {
	ProductWarrantyChain nextChain;
	public void setNextChain(ProductWarrantyChain nextChain) {
		nextChain = nextChain;
	}
	public void proceed(Product e) {
		if(ProductWarrantyManagment.isInStock(e)) {
			System.out.println("Producto disponible en stock");
			if(e.getPrice() >1000) {
				nextChain.proceed(e);
			}else {
				System.out.println("entrega de producto fecha dd//mm//yy ");				
			}

		}else {
			System.out.println("lo sentimos, el producto no se encuentra en stock");
		}
	}
}
