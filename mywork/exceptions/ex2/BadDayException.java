package mywork.exceptions.ex2;

public class BadDayException extends BadDateException {

	private static final long serialVersionUID = -90574226244467323L;
	
	private int day;
	
	public int getBadDay() {
		return this.day;
	}
	
	public BadDayException(String msg, int day) {
		super(msg);
		this.day = day;
	}
}
