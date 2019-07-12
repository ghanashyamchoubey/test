package Demo;

public class CandyCrush {

	public static void main(String[] args) {
		String input = "aaaadbbbbdddyggggx";
		System.out.println(candyCrushPro(input,5));
//		System.out.println(ccp(input,4));
//		char[] c= "aaaadbbbbdddgggg".toCharArray();
//		System.out.println(removeArray("aaaadbbbbdddgggg", 0, 3));

	}
	
//	private static String ccp(char[] charArr, int d) {
//		if(charArr.length ==0) {
//			return "";
//		}
//		int count = 1;
//		char current = charArr[0];
//		int initIndex = 0;
//		for (int i = 1; i < charArr.length; i++) {
//			if (current == charArr[i]) {
//				count++;
//			} else {
//				if (count >= d) {
//					remove(charArr, initIndex, initIndex+count);
//				}else {
//					initIndex = i;
//					count = 1;
//					current = charArr[i];
//				}
//			}
//		}
//		if(count >= d) {
//			return ccp(charArr, d);	
//		}else {
//			return input;
//		}
//		
//	}
	
	private static void remove(char[] chars, int i, int j) {
		for(int k =i; k < j; k++) {
			chars[k]=Character.MIN_VALUE;
		}
	}
	

	private static String candyCrushPro(String input, int d) {
		if(input.length() == 0) {
			return "";
		}
		char[] charArr = input.toCharArray();
		int count = 1;
		char current = charArr[0];
		int initIndex = 0;
		for (int i = 1; i < charArr.length; i++) {
			if (current == charArr[i]) {
				count++;
			} else {
				if (count >= d) {
					break;
				}else {
					initIndex = i;
					count = 1;
					current = charArr[i];
				}
			}
		}
		if (count >= d) {
			return candyCrushPro(removeArray(input, initIndex, initIndex+count), d);
		}else {
			return input;
		}
		

	}
	
	private static String removeArray(String charArr, int initIndex, int lastIndex) {
		StringBuilder s = new StringBuilder(charArr);
		return s.replace(initIndex, lastIndex, "").toString();
	}

}
