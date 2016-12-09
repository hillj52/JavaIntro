package mywork.intro.ex2;

public class ManipulatingNumbers {

	private static void print(int a, int b, int c, String op) {
		System.out.println(a + " " + op + " " + b + " = " + c);
	}
	
	public static void main(String[] args) {
		int a = 17, b = 4, c = a + b;
		
		print(a,b,c,"+");
		c = a/b;
		print(a,b,c,"/");
		c = a%b;
		print(a,b,c,"%");
		
	}

}
