package kodlama.io.coreLogging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Logged to database : " + data);
	}

}