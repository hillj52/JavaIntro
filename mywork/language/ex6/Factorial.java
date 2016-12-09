package mywork.language.ex6;

public class Factorial {
	private static int fact(int num) {
		if (num <= 0)
			return 0;
		else if (num==1)
			return num;
		else
			return num * fact(num-1);
	}
	
	public static void main(String[] args) {
		System.out.println("10 factorial is: " + fact(10));
	}
}
