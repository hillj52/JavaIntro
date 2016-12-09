package mywork.ooprogramming.ex2;

import java.util.StringTokenizer;

public class Person {

	private int age;
	private String firstName;
	private String lastName;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return this.getFirstName() + " " + this.getLastName();
	}
	
	public String toString() {
		return this.getFullName() + ", " + this.getAge();
	}
	
	public Person(String firstName, String lastName, int age) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
	}
	
	public Person(String fullName, int age) {
		StringTokenizer st = this.tokenize(fullName);
		if (st.countTokens()==2) {
			this.setFirstName(st.nextToken());
			this.setLastName(st.nextToken());
		} else {
			this.setFirstName("");
			this.setLastName("");
		}
		this.setAge(age);
	}
	
	private StringTokenizer tokenize(String fullName) {
		return new StringTokenizer(fullName);
	}
}
