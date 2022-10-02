package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Static block is working.");
	}

	public ProductValidator() {
		System.out.println("Contractor block is working.");
	}

	public boolean isValidate(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
