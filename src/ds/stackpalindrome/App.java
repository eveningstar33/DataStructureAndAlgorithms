package ds.stackpalindrome;

import java.util.LinkedList;

// Using a stack, determine whether a string is a palindrome
// Strings may contain punctuations and spaces. They should be ignored. Case should be ignored.

public class App {

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
		StringBuilder originalString = new StringBuilder(str.length());
		String lowerCase = str.toLowerCase();
		
		for (int i = 0; i < lowerCase.length(); i++) {
			char c = lowerCase.charAt(i);
			if (c >= 'a' && c <= 'z') {
				originalString.append(c);
				stack.push(c); 
			}
		}

		StringBuilder reversedString = new StringBuilder(originalString.length());
		while (!stack.isEmpty()) {
			reversedString.append(stack.pop());
		}
		
		return originalString.toString().equals(reversedString.toString()); 
	}
}
