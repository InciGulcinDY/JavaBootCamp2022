package polimorphismDemo;

public class Main {

	public static void main(String[] args) {
//		BaseLogger[] loggers = new BaseLogger[] { new DateBaseLogger(), new FileLogger(), new EmailLogger(), new ConsoleLogger() };
//		for (BaseLogger logger : loggers) {
//			logger.log("Log Message");
//		}

		CustomerManager customerManager = new CustomerManager(new DateBaseLogger());
		customerManager.add();
	}

}
