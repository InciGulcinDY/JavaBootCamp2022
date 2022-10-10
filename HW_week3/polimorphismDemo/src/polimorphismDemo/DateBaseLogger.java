package polimorphismDemo;

public class DateBaseLogger extends BaseLogger{

	public void log(String message) {
		System.out.println("Logged to database : " + message);
	}
}
