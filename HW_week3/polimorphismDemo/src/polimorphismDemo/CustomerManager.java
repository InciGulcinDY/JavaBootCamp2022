package polimorphismDemo;

public class CustomerManager {
	private BaseLogger baseLogger;

	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}

	public void add() {
		System.out.println("The customer has been added.");
		this.baseLogger.log("Log Message");

	}

}
