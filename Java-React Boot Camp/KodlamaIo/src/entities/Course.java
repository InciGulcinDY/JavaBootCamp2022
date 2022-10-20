package entities;

public class Course {
	// Attributes:
	private String java, phyton, cPlusPlus, react;
	private int fee;
	private Instructor instructor;
	private User user;
	private boolean isJava, isPhyton, isCPlusPlus, isReact;

	// Constructor :
	public Course(Instructor instructor, boolean isJava, boolean isPhyton, boolean isCPlusPlus, boolean isReact) {
		this.setInstructor(instructor);
		this.setJava(isJava);
		this.setPhyton(isPhyton);
		this.setCPlusPlus(isCPlusPlus);
		this.setReact(isReact);
	}

	public Course(User user, boolean isJava, boolean isPhyton, boolean isCPlusPlus, boolean isReact) {
		this.setUser(user);
		this.setJava(isJava);
		this.setPhyton(isPhyton);
		this.setCPlusPlus(isCPlusPlus);
		this.setReact(isReact);
	}

	// Encapsulation:
	public String getJava() {
		return java;
	}

	public void setJava(String java) {
		this.java = java;
	}

	public String getPhyton() {
		return phyton;
	}

	public void setPhyton(String phyton) {
		this.phyton = phyton;
	}

	public String getcPlusPlus() {
		return cPlusPlus;
	}

	public void setcPlusPlus(String cPlusPlus) {
		this.cPlusPlus = cPlusPlus;
	}

	public String getReact() {
		return react;
	}

	public void setReact(String react) {
		this.react = react;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public boolean isJava() {
		return isJava;
	}

	public void setJava(boolean isJava) {
		this.isJava = isJava;
	}

	public boolean isPhyton() {
		return isPhyton;
	}

	public void setPhyton(boolean isPhyton) {
		this.isPhyton = isPhyton;
	}

	public boolean isCPlusPlus() {
		return isCPlusPlus;
	}

	public void setCPlusPlus(boolean isCPlusPlus) {
		this.isCPlusPlus = isCPlusPlus;
	}

	public boolean isReact() {
		return isReact;
	}

	public void setReact(boolean isReact) {
		this.isReact = isReact;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
