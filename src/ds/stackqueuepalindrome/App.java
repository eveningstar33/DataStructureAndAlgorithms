package ds.stackqueuepalindrome;

import java.util.LinkedList;

public class App {

// Using a stack and a queue, determine whether a string is a palindrome
// Strings may contain punctuations and spaces. They should be ignored. Case should be ignored.
	
	public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
	}
	
	public static boolean checkForPalindrome(String str) {
		
		LinkedList<Character> stack = new LinkedList<>();
		LinkedList<Character> queue = new LinkedList<>();
		String lowerCase = str.toLowerCase();
		
		for (int i = 0; i < lowerCase.length(); i++) {
			char c = lowerCase.charAt(i);
			if (c >= 'a' && c <= 'z') {
				queue.addLast(c);
				stack.push(c); 
			}
		}
		
		while (!stack.isEmpty()) {
			if (!stack.pop().equals(queue.removeFirst())) {
				return false;
			}
		}
		return true;
	}
}
