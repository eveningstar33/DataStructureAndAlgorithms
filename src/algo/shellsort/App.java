package algo.shellsort;

public class App {

	public static void main(String[] args) {
		int[] intArray = {9, 8, 3, 13, 87, 12, 99, -32, 19, -21, 89, 54, -11, 77, 8, 47, -97, 95};
		
		for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < intArray.length; i++) {
				int newElement = intArray[i];
				int j = i;
				while (j >= gap && intArray[j - gap] > newElement) {
					intArray[j] = intArray[j - gap];
					j -= gap;
				}
				intArray[j] = newElement;
			}
		}
		
		for (int k = 0; k < intArray.length; k++) {
			System.out.println(intArray[k]); 
		}
	}
}
