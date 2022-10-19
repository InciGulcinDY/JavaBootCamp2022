package business;

import coreLogging.Logger;
import dataAccess.PersonDao;
import entities.Employee;

public class EmployeeManager {

	private static final int Year = 2022;
	// Attributes:
	private PersonDao personDao;
	private Logger[] loggers;

	// Encapsulation :
	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;

	}

	public Logger[] getLoggers() {
		return loggers;
	}

	public void setLoggers(Logger[] loggers) {
		this.loggers = loggers;
	}

	// Constructor:

	public EmployeeManager(PersonDao personDao, Logger[] loggers) {
		this.setPersonDao(personDao);
		this.setLoggers(loggers);
	}

	// business operation-1:

	public void add(Employee employee) {
		employeeId(employee);
		System.out.println("Employee Id : " + employee.getEmployeeId() + " has been added to the HR system.");

	}

	// business operation-2 :
	public void quitAJob(Employee employee) {
		Employee.setTotalEmployeeNumber(Employee.getTotalEmployeeNumber() - 1);
		System.out.println(employee.getEmployeeId() + " No employee has left the company.");
		System.out.println("Current number of personnel : " + Employee.getTotalEmployeeNumber());
	}

	// business operation-3 :
	public void getASalary(Employee employee) {
		FinanceManager financeManager = new FinanceManager();
		financeManager.bonus(employee);
		financeManager.salary(employee);
		financeManager.tax(employee);
		employee.setTotalSalary((employee.getBonus() + employee.getSalary() - employee.getTax()));
		System.out.println("Total Salary : " + employee.getTotalSalary());

	}

	// Auxiliary Operations :
	public void employeeId(Employee employee) {
		employee.setEmployeeId(employee.getCounter());
	}

	public void age(Employee employee) {
		employee.setAge(Year - employee.getBirthYear());
	}

}
