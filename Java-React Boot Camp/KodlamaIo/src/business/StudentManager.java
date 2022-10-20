package business;

import entities.Course;
import entities.User;

public class StudentManager {
	public void isStudent(User user, Course course) {
		if (course.isJava()) {
			System.out.println("You are a student in Java Camp.");
			course.setFee(course.getFee() + 1000);
		}
		if (course.isCPlusPlus()) {
			System.out.println("You are a student in C++ Camp.");
			course.setFee(course.getFee() + 1100);
		}
		if (course.isPhyton()) {
			System.out.println("You are a student in Phyton Camp.");
			course.setFee(course.getFee() + 1250);
		}
		if (course.isReact()) {
			System.out.println("You are a student in React Camp.");
			course.setFee(course.getFee() + 900);
		}
		if (!(course.isJava() || course.isCPlusPlus() || course.isPhyton() || course.isReact())) {
			System.out.println("You have not been enrolled any programme yet.");
		}

	}

	public void courseFee(User user, Course course) {
		System.out.println("Total fee : " + course.getFee() + " TL");
	}

}
