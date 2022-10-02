package polymorphisimJavaBootCamp2022;

public class CustomerManager {
	private BaseLogger logger;

	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}

	public void Add() {
		System.out.println("The customer is added.");
		this.logger.Log("Log message: ");
	}

}
