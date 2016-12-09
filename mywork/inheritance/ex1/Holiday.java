package mywork.inheritance.ex1;

import mywork.encapsulation.ex2.SimpleDate;

public class Holiday extends SimpleDate {

	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return super.toString() + " - " + this.name;
	}
	
	public Holiday(int month, int day, int year, String name) {
		super(month,day,year);
		this. name = name;
	}
}
