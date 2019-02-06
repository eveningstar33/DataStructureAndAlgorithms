package algo.selectionsort;

public class App {

	public static void main(String[] args) {

		int[] intArray = {9, 8, 3, 13, 87, 12, 99, -32, 19, -21, 89, 54, -11, 77, 8, 47, -97, 95};
		
		intArray = selectionSort(intArray);
		
		displaySortedArray(intArray);
	}
	
	public static int[] selectionSort(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			int minimum = i;
			boolean chMin = false;
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[j] < intArray[minimum]) {
					minimum = j;
					chMin = true;
				}
			}
			if (chMin) {
				swap(intArray, i, minimum);
			}
		}
		return intArray;
	}
	
	public static void swap(int[] intArray, int i, int j) {
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}
	
	public static void displaySortedArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
