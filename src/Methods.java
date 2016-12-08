/*	@author Yu Lin
 * 	CSCI 335
 * 	Binary Insertion Sort Project
 */

public class Methods {
	// Method with no student arguments.
	public Methods() {

	}

	// Method for student.
	public Methods(int id, String name, int age, double gpa) {
		this.id = id;
		this.age = age;
		this.gpa = gpa;
		this.name = name;
	}

	// Set student ID.
	public void setID(int id) {
		this.id = id;
	}

	// Get student ID.
	public int getID() {
		return id;
	}

	// Set student age.
	public void setAge(int age) {
		this.age = age;
	}

	// Get student age.
	public int getAge() {
		return age;
	}

	// Set student gpa.
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}

	// Get student gpa.
	public double getGPA() {
		return gpa;
	}

	// Set student name.
	public void setName(String name) {
		this.name = name;
	}

	// Get student name.
	public String getName() {
		return name;
	}

	// Display student info.
	@Override
	public String toString() {
		return ("ID: " + id + " Name: " + name + " Age: " + age + " GPA: " + gpa);
	}

	private int id, age;
	private double gpa;
	private String name;
}