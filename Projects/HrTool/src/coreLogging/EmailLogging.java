package coreLogging;

import entities.Employee;

public class EmailLogging implements Logger{

	@Override
	public void log(Employee employee) {
		System.out.println("Email log");
		
	}

}
