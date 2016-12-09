package mywork.ooprogramming.ex4;

import java.util.ArrayList;

public class SimpleDateTest {

	public static void main(String[] args) {
		ArrayList<SimpleDate> list = new ArrayList<SimpleDate>();
		list.add(new SimpleDate(2,1,1983));
		list.add(new SimpleDate(6,8));
		list.add(new SimpleDate(5));
		list.add(new SimpleDate());
		
		for (SimpleDate sd:list) {
			System.out.println(sd);
		}
	}

}
