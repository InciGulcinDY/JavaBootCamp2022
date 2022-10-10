package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "Black");

		System.out.println(product.getCode());

		ProductManager productManager = new ProductManager();
		productManager.add(product);

	}

}
