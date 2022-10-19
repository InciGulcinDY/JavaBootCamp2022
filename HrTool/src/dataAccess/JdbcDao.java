package dataAccess;

public class JdbcDao implements PersonDao {

	@Override
	public void daoAdd() {
		System.out.println("The data has been added to the Jdbc Database.");

	}

}
