package coreLogging;

import entities.Employee;

public class DatabaseLogging implements Logger {

	@Override
	public void log(Employee employee) {
		System.out.println("Database log");
	}

}
