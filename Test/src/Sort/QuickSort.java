package Sort;

import java.util.Arrays;

public class QuickSort {
	
	private static int[] arr;

	public static void main(String[] args) {
		int[] inpArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		QuickSort qs = new QuickSort();
		arr = inpArr;
		qs.sort(0,inpArr.length-1);
		for (int i : inpArr) {
			System.out.print(i);
			System.out.print(" ");
		}

	}

	private void sort(int low, int high) {
		int i = low;
		int j = high;
		
		int pivot = arr[low + (high - low)/2];
		
		while(i <= j) {
			while(arr[i] < pivot) {
				i++;
			}
			while(arr[j] > pivot) {
				j--;
			}
			if(i <= j) {
				swap(i,j);
				i++;
				j--;
			}
			if(low < j) {
				sort(low, j);
			}
			if(i < high) {
				sort(i, high);
			}
		}
		
	}

	private void swap(int i, int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
