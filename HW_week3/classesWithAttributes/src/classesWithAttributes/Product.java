package classesWithAttributes;

public class Product {

	// Contractor :
	public Product(int id, String name, String description, double price, int stockAmount, String colour) {
		this.id = id;
		this.colour = colour;
		this.description = description;
		this.price = price;
		this.name = name;
		this.stockAmount = stockAmount;
	}

	// Attribute / field:
	private int id, stockAmount;
	private String name, description, colour, code;
	private double price;

	// Getter, Setter :
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getCode() {
		return this.name.substring(0, 1) + id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
