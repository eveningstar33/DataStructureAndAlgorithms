package algo.mergesort;

public class MergeSort {

	public void sort(int[] inputArray) {
		sort(inputArray, 0, inputArray.length - 1);
	}
	
	public void sort(int[] inputArray, int start, int end) {
		
		if (end <= start) {
			return;  // We're done traversing the array
		}
		
		int mid = (start + end)/2;
		sort(inputArray, start, mid);  // sort left half
		sort(inputArray, mid + 1, end);    // sort right half
		merge(inputArray, start, mid, end);  // merge sorted results into the inputArray
	}
	
	public void merge(int[] inputArray, int start, int mid, int end) {
		int[] tempArray = new int[end - start + 1];
		
		// index counter for the left side of the array
		int leftSlot = start;
		// index counter for the right side of the array
		int rightSlot = mid + 1;
		int k = 0;
		
		while (leftSlot <= mid && rightSlot <= end) {
			if (inputArray[leftSlot] < inputArray[rightSlot]) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
			} else {
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
			}
			k++;
		}
		
		if (leftSlot <= mid) {
			while (leftSlot <= mid) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
				k++;
			}
		} else if (rightSlot <= end) {
			while (rightSlot <= end) {
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
				k++;
			}
		}
		
		// copy over the temp array into the appropriate slots of the inputArray
		for (int i = 0; i < tempArray.length; i++) {
			inputArray[start + i] = tempArray[i];
		}
	}
}
