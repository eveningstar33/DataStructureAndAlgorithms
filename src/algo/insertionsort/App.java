package algo.insertionsort;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[] intArray = {9, 8, 3, 13, 87, 12, 99, -32, 19, -21, 89, 54, -11, 77, 8, 47, -97, 95};
		intArray = insertionSort(intArray);
		displaySortedArray(intArray);
	}
	
	public static int[] insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int element = a[i]; 
			int j = i - 1;
			while (j >= 0 && a[j] > element) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = element; 
		}
		return a;	
	}

	public static void displaySortedArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
}
