package mywork.language.ex1;

public class SumOdd {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<100;i+=2) {
			sum += i;
		}
		System.out.println("Sum: " + sum);
	}

}
