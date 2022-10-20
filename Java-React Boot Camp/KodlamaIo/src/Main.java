import business.InstructorManager;
import business.StudentManager;
import business.UserManager;
import entities.Course;
import entities.Instructor;
import entities.User;

public class Main {

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor("Engin", "Demirog");
		Instructor instructor2 = new Instructor("Elon", "Musk");

		User user1 = new User("Steve", "Jobs");
		User user2 = new User("Bill", "Gates");

		InstructorManager instructorManager = new InstructorManager();
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();

		instructorManager.instructorAdd(instructor1);
		Course capability1 = new Course(instructor1, true, true, false, true);

		System.out.println("----------------------------------------------");

		instructorManager.instructorAdd(instructor2);
		Course capability2 = new Course(instructor2, false, false, true, true);

		System.out.println("----------------------------------------------");

		userManager.userAdd(user1);
		Course course1 = new Course(user1, true, false, true, false);
		studentManager.isStudent(user1, course1);
		studentManager.courseFee(user1, course1);

		System.out.println("----------------------------------------------");

		userManager.userAdd(user2);
		Course course2 = new Course(user2, false, false, false, false);
		studentManager.isStudent(user2, course2);
		studentManager.courseFee(user2, course2);

		System.out.println("----------------------------------------------");

	}

}
