package classesWithAttributesJavaBootCamp2022;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"black");
		
		
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");;
		product.setPrice(5000);;
		product.setStockAmount(3);;
		
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		productManager.add2(1, "", "", 2, 200);

		System.out.println(product.getName());

	}

}
