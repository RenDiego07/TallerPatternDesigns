package Warranty;
import modelo.Product;
import java.util.Date;
public class CustomerServiceHandler extends Handler {
	ProductWarrantyChain nextChain;
	Date currentDate;
	public void setNextChain(ProductWarrantyChain nextChain) {
		nextChain = nextChain;
	}
	public void proceed(Product e) {
		// 
		if(ProductWarrantyManagment.isActiveWarranty(e.getWarrantyPeriod(), currentDate )) {
			System.out.println("Producto aun mantiene garantia");
			if(nextChain != null) {
				nextChain.proceed(e);	
			}
			System.out.println("No se asigno un nextHandler");
			
		}else {
			System.out.println("lo sentimos, la fecha de garantia ya no esta disponible");
			System.out.println("muchas gracias por la visita");
		}
	}	


}
