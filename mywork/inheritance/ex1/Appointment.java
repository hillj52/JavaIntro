package mywork.inheritance.ex1;

import mywork.encapsulation.ex2.SimpleDate;

public class Appointment extends SimpleDate {
	
	private String place;
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public String getPlace() {
		return this.place;
	}
	
	public String toString() {
		return super.toString() + ", with " + name + " at " + place;
	}
	
	public Appointment(int month, int day, int year, String place, String name) {
		super(month,day,year);
		this.name = name;
		this.place = place;
	}
}
