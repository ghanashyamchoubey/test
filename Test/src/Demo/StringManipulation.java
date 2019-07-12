package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StringManipulation extends Example {

	public StringManipulation(String str) {
		super(str);
		System.out.println("Gamma" + str);
		new Example(str);
	}
	

	static int NO_OF_CHAR = 256;

	public static boolean isAnagram(char[] str1, char[] str2) {
		int count[] = new int[NO_OF_CHAR];
		Arrays.fill(count, 0);
		int i;
		if (str1.length != str2.length) {
			return false;
		}
		// increase and decrease the int value in count array for each char in the
		// string so that the net increase will be zero in case of anagram string
		for (i = 0; i < str1.length; i++) {
			count[str1[i]]++;
			count[str2[i]]--;
		}
		for (i = 0; i < NO_OF_CHAR; i++) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static void duplicate(char[] str) {
		int count[] = new int[NO_OF_CHAR];
		int i;
		Arrays.fill(count, 0);
		for (i = 0; i < str.length; i++) {
			count[str[i]]++;
		}
		for (i = 0; i < NO_OF_CHAR; i++) {
			if (count[i] > 1) {
				System.out.println((char) i + " --> count = " + count[i]);
			}
		}
	}

	public static String removeSpecial(String str) {
		char[] charArr = str.toCharArray();
		char[] charArrNew = new char[10];
		int count = 0;
		for (int i = 0; i < charArr.length; i++) {
			if (((int) charArr[i] >= 65 && (int) charArr[i] <= 97)
					|| ((int) charArr[i] >= 97 && (int) charArr[i] <= 122)) {
				charArrNew[count] = charArr[i];
				count++;
			}
		}
		return new String(charArrNew);
	}

	public static void fibonacci(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		if (n == 0) {
			System.out.println(0);
		} else {
			System.out.println(0);
			System.out.println(1);
			for (int i = 2; i <= n; i++) {
				c = a + b;
				a = b;
				b = c;
				System.out.println(c);
			}
		}
	}

	public static void sortByValue() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 2);
		map.put("C", 8);
		map.put("D", 3);
		map.put("E", 9);
		map.put("B", 1);
		map.put("F", 6);

		HashMap<String, Integer> newMap = new LinkedHashMap<String, Integer>();
		List<Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
		System.out.println(list);
		Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

//		list.stream().collect(Collectors.toMap(Entry::getKey,Entry::getValue));

		for (Entry<String, Integer> entry : list) {
			newMap.put(entry.getKey(), entry.getValue());
		}

		newMap.forEach((k, v) -> System.out.println("Key : " + k + "  Value : " + v));
	}

	static int convert(String str) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			result = result * 10 + str.charAt(i) - '0';
		}
		return result;
	}

	static void XYZ(int x, String... a) {
		System.out.println(a[a.length - 1] + " ");
		try {
			throw new OutOfMemoryError("acx");
		} catch (OutOfMemoryError e) {
			System.out.println("ABC");
		}

	}

	static Map<Character, Integer> duplicate(String str) {
		Map<Character, Integer> finalMap = new HashMap<Character, Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			if (null != finalMap.get(str.charAt(i))) {
				count = finalMap.get(str.charAt(i)) + 1;
				finalMap.put(str.charAt(i), count);
			} else {
				finalMap.put(str.charAt(i), count);
			}
		}
		
		return finalMap;
	}

	public static void main(String[] args) {
//		System.out.println(convert("1234"));
		char[] str1 = "integral".toCharArray();
		char[] str2 = "traingle".toCharArray();
//		StringManipulation st = new StringManipulation("Rocky");
//		st.two();
//		st.example();st.test();
//		st.StringManipulation();
//		XYZ(1, "hi");
//		XYZ(0, "hi", "world");
//		System.out.println(isAnagram(str1, str2));
//		duplicate("geeks for geeks".toLowerCase().toCharArray());
//		System.out.println(removeSpecial("as%fd$g*."));
//		fibonacci(10);

//		sortByValue();
//		System.out.println(duplicate("apple"));
//		Map<Character, Integer> newMap = new HashMap<Character, Integer>();
//		newMap.put('a', 1);
//		newMap.put('p', 2);
//		newMap.put('e', 1);
//		newMap.put('r', 1);
//		assert duplicate("apple").equals(newMap);
		
		String s = "heloo";
		s = s.replaceAll("o", "X");
		System.out.println(s);
		
	}

	public void test() {
		System.out.println("Bekar!!");
	}

	public void example() {
		System.out.println("I love you");
	}

	@Override
	public void two() {
		System.out.println("I dont");
	}

}
