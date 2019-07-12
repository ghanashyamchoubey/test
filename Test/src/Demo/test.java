package Demo;

import java.util.ArrayList;
import java.util.List;

public class test {
	public int test12() {
		try {
			throw new NullPointerException();
		}
		catch(Exception e){
			return 1;
		}
		finally {
			return 2;
		}
	}
	
	
	public static void main(String[] args) {
//		 test t = new test();
		String s1 = "Hi";
		String s2 = "Hello";
		String temp = s1;
		s1 = s2;
		s2 = temp;
//		swap(s1, s2);
		System.out.println(s1);
		System.out.println(s2);

//		final List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.remove(2);
//		list.remove(Integer.valueOf(4));
//		System.out.println(list);
	}
	
	public static void swap(String a, String b) {
		String temp = a;
		a = b;
		b = temp;
	}
}
