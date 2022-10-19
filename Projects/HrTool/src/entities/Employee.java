package entities;

public class Employee extends Person {
	// Attributes:
	private int employeeId, hireYear;
	private String title;
	static int totalEmployeeNumber;
	private int salary, totalSalary, bonus, tax;
	private int counter = totalEmployeeNumber;
	private static int[] salaries = new int[totalEmployeeNumber];

	// Constructor:
	public Employee(String firstName, String lastName, String title, int birthYear, int hireYear) {
		this.setFistName(firstName);
		this.setLastName(lastName);
		this.setTitle(title);
		this.setBirthYear(birthYear);
		this.setHireYear(hireYear);
		totalEmployeeNumber++;
		counter++;
	}

	// Encapsulation:
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public static int[] getSalaries() {
		return salaries;
	}

	public static void setSalaries(int[] salaries) {
		Employee.salaries = salaries;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public static int getTotalEmployeeNumber() {
		return totalEmployeeNumber;
	}

	public static void setTotalEmployeeNumber(int totalEmployeeNumber) {
		Employee.totalEmployeeNumber = totalEmployeeNumber;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(int totalSalary) {
		this.totalSalary = totalSalary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

}
