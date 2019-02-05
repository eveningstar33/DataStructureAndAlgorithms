package algo.binarysearch;

public class App {

	public static void main(String[] args) {
		int[] a = {3, 5, 7, 9, 16, 28, 32, 47, 54, 67, 71, 83, 99, 121, 324, 213, 657, 435, 987, 768};
		System.out.println(binarySearch(a, 7));
	}
	
	public static int binarySearch(int[] a, int x) {
		int p = 0;
		int r = a.length - 1;
		
		while (p <= r) {
			int q = (p + r)/2;
			if (a[q] == x) {
				return q;
			}
			if (a[q] > x) {
				r = q - 1;
			} else {
				p = q + 1;
			}
		}
		return -1;
	}
}
