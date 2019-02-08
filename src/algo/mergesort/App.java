package algo.mergesort;

public class App {

	public static void main(String[] args) {
		int[] inputArray = {9, 17, 3, 100, 26, -3, 222, 61, -18, 999, 2, 13, 20};
		
		MergeSort sorter = new MergeSort();
		
		sorter.sort(inputArray);
		
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
	}
}
