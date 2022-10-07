package bankCreditSystemYouTubeTraining;

public class Main {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.setId(1);
		person1.setFirstName("Engin");
		person1.setLastName("Demirog");
		person1.setNationalIdentity("5236984");

		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save(person1);

		TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
		CustomerManager customerManager = new CustomerManager(person1, teacherCreditManager);
		customerManager.save();
		customerManager.delete();
		customerManager.giveCredit();

		Company company = new Company();
		company.setId(2);
		company.setCompanyName("Arcelik");
		company.setCity("Antalya");
		company.setTaxNumber("100000");

		CustomerManager customerManager2 = new CustomerManager(company, teacherCreditManager);
		customerManager2.save();
		customerManager2.delete();
		customerManager2.giveCredit();

	}

}
