package mywork.methods.ex3;

import java.util.ArrayList;

public class SimpleDateTest {

	public static void main(String[] args) {
		ArrayList<SimpleDate> list = new ArrayList<SimpleDate>();
		list.add(new SimpleDate(2,1,1983));
		list.add(new SimpleDate(6,8));
		list.add(new SimpleDate(5));
		list.add(new SimpleDate());
		list.add(new SimpleDate("6/8/1986"));
		
		for (SimpleDate sd:list) {
			System.out.println(sd);
		}
	}

}
