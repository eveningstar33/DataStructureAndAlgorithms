package algo.quicksort;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] inputArray = {12, 81, 74, 43, 1098, -5, 0, 8, 92, 17, 754, 912, -20, 6, 4, -19};
		quickSort(inputArray, 0, inputArray.length - 1);
		
		System.out.println(Arrays.toString(inputArray)); 
	}
	
	public static void quickSort(int[] inputArray, int start, int end) {
		if (start < end) {
			// index position of the correctly placed value in the array 
			int pivotIndex = partition(inputArray, start, end);
			// sorts the left half of the range
			quickSort(inputArray, start, pivotIndex - 1);  
			// sorts the right half of the range
			quickSort(inputArray, pivotIndex + 1, end);    
		}
	}
	
	public static int partition(int[] inputArray, int start, int end) {
		int pivot = inputArray[end];
		// in the first iteration, i starts from -1
		int i = start - 1;
		for (int j = start; j <= end - 1; j++ ) {
			if (inputArray[j] < pivot) {
				i++;
				if (i != j) {
					swap(inputArray, i, j);
				}
			}
		}
		swap(inputArray, i + 1, end);
		
		return i + 1;
	}
	
	public static void swap(int[] inputArray, int i, int j) {
		int temp = inputArray[i];
		inputArray[i] = inputArray[j];
		inputArray[j] = temp;
	}
}
