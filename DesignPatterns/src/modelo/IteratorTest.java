package modelo;

public class IteratorTest {
	public static void main(String[] args) {
		ProductsCollection wareHouse = new Products();

		User u = new User();
		
		switch(u.getType()) {
			case "web":
				Iterator iterator = wareHouse.createIteratorWeb();
				u.iterate();
				break;
			case "Salesman":
				Iterator iterator2 = wareHouse.createIteratorRetailer(u.getStore());
				u.iterate();
				break;
			case "Supplier":
				Iterator iterator3 = wareHouse.createIteratorSupplier();
				u.iterate();
				break;
		}
		
	}
}
