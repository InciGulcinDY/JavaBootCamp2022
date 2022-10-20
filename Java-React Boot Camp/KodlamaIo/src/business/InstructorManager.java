package business;

import entities.Course;
import entities.Instructor;

public class InstructorManager extends PersonManager {

	public void instructorAdd(Instructor instructor) {
		System.out.println("Instructor : " + instructor.getFirstName() + " " + instructor.getLastName());
		password(instructor);
		System.out.println("Password : " + instructor.getPassword());
	}

}
