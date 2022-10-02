package staticDemo;

public class ProductManager {
	public void add(Product product) {
		ProductValidator validator = new ProductValidator();
		
		if (validator.isValidate(product)) {
			System.out.println("Added");
		}else {
			System.out.println("Product informations are invalid.");
		}
	}

}
