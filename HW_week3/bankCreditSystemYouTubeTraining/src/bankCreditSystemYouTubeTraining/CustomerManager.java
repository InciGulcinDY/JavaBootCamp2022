package bankCreditSystemYouTubeTraining;

public class CustomerManager {
	private Customer customer;
	private ICreditManager creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}

	public void save() {
		System.out.println("Customer has been registered to the system : ");
	}

	public void delete() {
		System.out.println("Customer has been deleted to the system : ");
	}

	public void giveCredit() {
		creditManager.calculate();
		System.out.println("The credit has been given.");

	}

}
