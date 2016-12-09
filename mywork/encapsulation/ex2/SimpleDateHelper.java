package mywork.encapsulation.ex2;

import java.util.Date;

public class SimpleDateHelper {

	private static SimpleDateHelper instance = null;
	
	public static SimpleDateHelper getInstance() {
		if(instance==null) 
			instance = new SimpleDateHelper();
		return instance;
	}
	
	private Date date;
	
	@SuppressWarnings("deprecation")
	public int getDay() {
		return this.date.getDate();
	}
	
	@SuppressWarnings("deprecation")
	public int getYear() {
		return this.date.getYear() + 1900;
	}
	
	@SuppressWarnings("deprecation")
	public int getMonth() {
		return this.date.getMonth() + 1;
	}
	
	private SimpleDateHelper() {
		this.date = new Date();
	}
}
