package com.api.assessment;

public class File2 {

	/**
	 * Reverses a given string. This method takes a string input and returns a new
	 * string which is the reverse of the input.
	 *
	 * @param input the string to be reversed
	 * @return the reversed string
	 */
	public static String reverseString(String input) {
		return new StringBuilder(input).reverse().toString();
	}

	/**
	 * Checks if a string is a palindrome. This method checks whether a given string
	 * is a palindrome, meaning it reads the same forward and backward.
	 *
	 * @param input the string to check
	 * @return true if the string is a palindrome, false otherwise
	 */
	public static boolean isPalindrome(String input) {
		String reversed = reverseString(input);
		return input.equals(reversed);
	}

	/**
	 * Main method. Tests the string reversal and palindrome checking methods.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		String testString = "madam";
		String reversed = reverseString(testString);
		boolean palindrome = isPalindrome(testString);

		System.out.println("Original string: " + testString);
		System.out.println("Reversed string: " + reversed);
		System.out.println("Is palindrome: " + palindrome);
	}
}
