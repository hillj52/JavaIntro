package mywork.exceptions.ex2;

public class SimpleDate {
	
	private static int[] months =
		{31,28,31,30,31,30,
		31,31,30,31,30,31};
	private static String[] names =
		{"January","February","March","April","May","June",
		"July","August","September","October","November","December"};

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
	public String getMonthAsString() {
		return names[this.month-1];
	}
	public int getDayOfYear() {
		int days = this.isLeapYear()&&this.month>2?1:0;
		for(int i=1;i<this.month;i++) {
			days += months[i-1];
		}
		return days + this.day;
	}
	public int getDaysLeftInYear() {
		return this.isLeapYear()?366-this.getDayOfYear():365-this.getDayOfYear();
	}
	public boolean isLeapYear() {
		return year % 400 == 0 || ((year % 100 != 0)&&(year % 4 == 0));
	}
	@Override
	public String toString() {
		return new StringBuilder(10).append(this.getMonth()).
				append('/').append(this.getDay()).
				append('/').append(this.getYear()).toString();
	}
	
	public SimpleDate(int month, int day, int year) {
		if(month<=0||month>12)
			throw new BadMonthException("Invalid month, must be 1 <= month <= 12",month);
		if(day<=0||day>months[month])
			throw new BadDayException("Invalid Day for month " + names[month] 
					+ ", must be 1 <= day <= " + months[month],day);
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
