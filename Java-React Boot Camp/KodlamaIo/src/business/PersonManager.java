package business;

import java.util.Random;

import entities.Person;

public class PersonManager {
	public void password(Person person) {
		Random random = new Random();
		person.setPassword(random.nextInt());
	}

}
