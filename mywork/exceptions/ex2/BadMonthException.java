package mywork.exceptions.ex2;

public class BadMonthException extends BadDateException {

	private static final long serialVersionUID = -2060462362570269985L;
	
	private int month;
	
	public int getBadMonth() {
		return this.month;
	}

	public BadMonthException(String msg, int month) {
		super(msg);
		this.month = month;
	}
}
