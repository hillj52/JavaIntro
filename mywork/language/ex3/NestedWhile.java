package mywork.language.ex3;

public class NestedWhile {
	public static void main(String[] args) {
		int i = 1,j = 8;
		while (j>0) {
			while(i<j) {
				System.out.print(i + " ");
				i++;
			}
			j--;
			i = 1;
			System.out.println();
		}
	}
}
