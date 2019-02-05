package algo.binarysearch;

public class App {

	public static void main(String[] args) {
		int[] a = {3, 5, 7, 9, 16, 28, 32, 47, 54, 67, 71, 83, 99, 121, 213, 324, 435, 657, 768, 987};
//		System.out.println(binarySearch(a, 7));
		System.out.println(recursiveBinarySearch(a, 0, a.length - 1, 71));
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
	
	public static int recursiveBinarySearch(int a[], int p, int r, int x) {
		if (p > r) {
			return -1;
		} else {
			int q = (p + r)/2;
			if (a[q] == x) {
				return q;
			} else if (a[q] > x) {
				return recursiveBinarySearch(a, p, q - 1, x);
			} else {
				return recursiveBinarySearch(a, q + 1, r, x);
			}
		}
	}
}
