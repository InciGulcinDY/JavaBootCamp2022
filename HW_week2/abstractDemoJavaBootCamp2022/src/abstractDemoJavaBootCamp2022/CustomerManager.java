package abstractDemoJavaBootCamp2022;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	public void getCustomers() {
		databaseManager.getData();
	}

}
