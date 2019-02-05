package algo.search;

public class App {

	public static void main(String[] args) {
		int[] a = {3, 5, 1, 9, 6, 8, 2, 7, 4};
		System.out.println(linearSearch(a, 4));
	}
	
	public static int linearSearch(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}
}
