package mywork.language.ex5;

public class PosOrNeg {

	private static String getInfo(int number) {
		String info = " is ";
		if(number < 0)
			info += "negative and ";
		else if(number > 0)
			info += "positive and ";
		if(number%2==0)
			info += "even";
		else
			info += "odd";
		return info;
	}
	
	public static void main(String[] args) {
		for(int i=-4;i<=4;i++) {
			System.out.println(i + getInfo(i));
		}
	}

}
