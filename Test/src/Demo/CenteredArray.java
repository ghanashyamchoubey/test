package Demo;

public class CenteredArray {
	
	
	public static int ifCenteredArray(int[] arr) {
		if(arr.length % 2 == 1) {
			int mid = arr[arr.length/2];
			
			for(int i = 0; i< arr.length; i++) {
				if(arr[i] < mid) {
					return 0;
				}
			}
			return 1;
		}
		return 0;
	}
	public static int returnDiffArray(int[] arr) {
		int sumOdd = 0;
		int sumEven = 0;
	
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] % 2 == 1) {
				sumOdd = sumOdd + arr[i];
			}
			else {
				sumEven =sumEven + arr[i];
			}
		}
		
		return sumOdd-sumEven;
		
	}

	public static void main(String[] args) {
		int[] arr = {6,4,7,9};
		System.out.println(ifCenteredArray(arr));
		System.out.println(returnDiffArray(arr));
		
	}
	
	

}
