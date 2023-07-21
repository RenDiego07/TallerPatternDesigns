package Warranty;
import modelo.Product;
public class TecnicalServiceHandler implements ProductWarrantyChain{
	ProductWarrantyChain nextChain;
	public void setNextChain(ProductWarrantyChain nextChain) {
		nextChain = nextChain;
	}
	public void proceed(Product e) {
		if(ProductWarrantyManagment.damagedCovered(e.brokenType())) {
			System.out.println("los tipos de daño son asegurados por la garantia");
			nextChain.proceed(e);
		}else {
			System.out.println("lo sentimos, la garantia no cubre los daños");
	
		}
	}	

}
