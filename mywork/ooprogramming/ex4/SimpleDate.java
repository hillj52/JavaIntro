package mywork.ooprogramming.ex4;

public class SimpleDate {

	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return new StringBuilder(10).append(this.getMonth()).
				append('/').append(this.getDay()).
				append('/').append(this.getYear()).toString();
	}
	
	public SimpleDate(int month, int day, int year) {
		this.setMonth(month);
		this.setDay(day);
		this.setYear(year);
	}
	
	public SimpleDate(int month, int day) {
		this(month,day,SimpleDateHelper.getInstance().getYear());
	}
	
	public SimpleDate(int day) {
		this(SimpleDateHelper.getInstance().getMonth(),day);
	}
	
	public SimpleDate() {
		this(SimpleDateHelper.getInstance().getDay());
	}
}
