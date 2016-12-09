package mywork.language.ex7;

public class ConsecutiveSum {

	private static int isSet(int num) {
		int sum = 0;
		int i = num;
		while (sum<10000) {
			sum += i;
			if(sum==10000) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		for(int i=-10000;i<=10000;i++) {
			int setMax = isSet(i);
			if(setMax!=-1) {
				System.out.println(i + " -> " + setMax);
			}
		}

	}

}
