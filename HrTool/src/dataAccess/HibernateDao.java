package dataAccess;

public class HibernateDao implements PersonDao {

	@Override
	public void daoAdd() {
		System.out.println("The data has been added to the Hibernate Database.");

	}

}
