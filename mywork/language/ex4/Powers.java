package mywork.language.ex4;

public class Powers {

	private static String getRow(int number) {
		int square = (int)Math.pow(number, 2);
		int cube = (int)Math.pow(number, 3);
		return number + "\t" + square + "\t" + cube;
	}
	
	public static void main(String[] args) {
		System.out.println("Number\tSquare\tCube");
		System.out.println("************************");
		for (int i=20;i<=60;i+=2) {
			System.out.println(getRow(i));
		}
	}

}
