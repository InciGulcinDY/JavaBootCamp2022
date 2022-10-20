package business;

import java.util.Random;

import entities.User;

public class UserManager extends PersonManager {
	public void userAdd(User user) {
		System.out.println("USER : " + user.getFirstName() + " " + user.getLastName());
		System.out.println("Welcome to the Kodlama io family!");
		password(user);
		System.out.println("Password : " + user.getPassword());
	}

}
