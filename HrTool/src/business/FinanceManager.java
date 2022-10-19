package business;

import entities.Employee;

public class FinanceManager {
	private static final int Year = 2022;

	// Business rule-1 :
	public void salary(Employee employee) {
		if (employee.getTitle().equals("HR Manager") || employee.getTitle().equals("Technic Manager")) {
			employee.setSalary(60000);
		} else if (employee.getTitle().equals("Engineer") || employee.getTitle().equals("Chief")) {
			employee.setSalary(25000);
		} else if (employee.getTitle().equals("Staff") || employee.getTitle().equals("Intern")) {
			employee.setSalary(7000);
		}
	}

	// Business rule-2 :
	public void bonus(Employee employee) {
		int experienceYear = Year - employee.getHireYear();
		if (experienceYear >= 10) {
			employee.setBonus(20000);
		} else if (experienceYear < 10 && experienceYear >= 3) {
			employee.setBonus(10000);
		} else if (experienceYear < 3) {
			employee.setBonus(2000);
		}
	}

	// Business rule-3 :
	public void tax(Employee employee) {
		if (employee.getAge() >= 45) {
			employee.setTax(1000);
		} else if (employee.getAge() < 45 && employee.getAge() > 30) {
			employee.setTax(1500);
		} else if (employee.getAge() <= 30) {
			employee.setTax(2000);
		}
	}

}
