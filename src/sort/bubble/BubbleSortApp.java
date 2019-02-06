package sort.bubble;

// The time complexity of Bubble Sort is O(n*n), so it's quadratic algorithm.
// This algorithm is one of the least efficient algorithms.

public class BubbleSortApp {

	public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; 
				lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[i+1]) {
					swap(intArray, i, i+1);
				}
			}
		}
		
		display(intArray);
	}
	
	public static void swap(int[] intArray, int i, int j) {
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
		
	}
	
	public static void display(int[] intArray) {
		for (int i = 0; i < intArray.length - 1; i++) {
			System.out.println(intArray[i]);
		}
	}
}
