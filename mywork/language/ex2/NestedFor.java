package mywork.language.ex2;

public class NestedFor {

	public static void main(String[] args) {
		for(int i=1;i<8;i++){
			for(int j=i;j>0;j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
