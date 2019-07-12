package Sort;

public class MergeSort {

	private int[] tempArray;
	private int length;
	private int[] arr;

	public static void main(String[] args) {
		int[] inpArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		MergeSort mms = new MergeSort();
		mms.sort(inpArr);
		for (int i : inpArr) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

	private void sort(int[] inpArr) {
		this.tempArray = new int[inpArr.length];
		this.length = inpArr.length;
		this.arr = inpArr;
		doMergeSort(0, length-1);
		
	}

	private void doMergeSort(int start, int end) {
		
		if(start < end) {
			int mid = start + (end - start)/2;
			//Sort the left side of the array
			doMergeSort(start, mid);
			doMergeSort(mid+1, end);
			merge(start, mid, end);
		}
		
	}

	private void merge(int start, int mid, int end) {
		for(int i = start; i <= end; i++) {
			tempArray[i] = arr[i];
		}
		
		int i = start;
		int j = mid + 1;
		int k = start;
		
		while(i <= mid && j <= end) {
			if(tempArray[i] <= tempArray[j]) {
				arr[k] = tempArray[i];
				i++;
			}
			else {
				arr[k] = tempArray[j];
				j++; 
			}
			k++;
		}
		
		while(i <= mid) {
			arr[k] = tempArray[i];
			i++; k++;
		}
		
	}

}
