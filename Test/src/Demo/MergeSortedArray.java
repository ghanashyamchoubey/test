package Demo;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7};
		int[] arr2 = { 2, 4, 6, 8, 9};
		
		int[] arr3 = merge(arr1, arr2);
		System.out.println("Array after merging");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}

	}

	public static int[] merge(int[] arr1, int[] arr2) {

		int l1 = arr1.length;
		int l2 = arr2.length;
		int j = 0;
		int i = 0;
		int k = 0;
		int[] fin = new int[l1 + l2];

		while (i < l1 && j < l2) {
			if (arr1[i] > arr2[j]) {
				fin[k++] = arr2[j++];
			} else {
				fin[k++] = arr1[i++];
			}
		}

		while (i < l1) {
			fin[k++] = arr1[i++];
		}

		while (j < l2) {
			fin[k++] = arr2[j++];
		}

		return fin;

	}

}
