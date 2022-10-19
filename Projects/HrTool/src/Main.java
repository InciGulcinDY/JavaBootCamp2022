import business.EmployeeManager;
import business.FinanceManager;
import coreLogging.DatabaseLogging;
import coreLogging.EmailLogging;
import coreLogging.Logger;
import dataAccess.HibernateDao;
import entities.Employee;

public class Main {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Sezgin", "Yolcu", "Technic Manager", 2014, 1986);
		Employee employee2 = new Employee("İnci Gulcin", "Durak Yolcu", "Engineer", 2014, 1989);
		Employee employee3 = new Employee("Beyza", "Etiz", "HR Manager", 2020, 1994);
		Employee employee4 = new Employee("Kadir Emre", "Durak", "Chief", 2012, 1991);

		Logger[] loggers = { new DatabaseLogging(), new EmailLogging() };

		EmployeeManager employeeManager = new EmployeeManager(new HibernateDao(), loggers);
		employeeManager.add(employee1);
		employeeManager.getASalary(employee1);
		System.out.println("-------------------------------------------------------------");
		employeeManager.add(employee2);
		employeeManager.getASalary(employee2);
		System.out.println("-------------------------------------------------------------");
		employeeManager.add(employee3);
		employeeManager.getASalary(employee3);
		System.out.println("-------------------------------------------------------------");
		employeeManager.add(employee4);
		employeeManager.getASalary(employee4);
		System.out.println("-------------------------------------------------------------");

		System.out.println("-------------------------------------------------------------");

		employeeManager.quitAJob(employee2);
	}

}
