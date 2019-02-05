package algo.recursion;

public class App {

	public static void main(String[] args) {		
		int[] a = {3, 5, 1, 9, 6, 8, 2, 7, 4};
		System.out.println(recursiveLinearSearch(a, 0, 2));
	}
	
	public static int recursiveLinearSearch(int[] a, int i, int x) {
		if (i > a.length - 1) {
			return -1;
		} else if (a[i] == x) {
			return i;
		} else {
			return recursiveLinearSearch(a, i+1, x);
		}
	}
}
