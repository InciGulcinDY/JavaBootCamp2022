package interfaces;

public class MySqlCustomerDal implements ICustomerDal,  IRepository {

	public void add() {
		System.out.println("Data has been added to My Sql.");

	}

}
