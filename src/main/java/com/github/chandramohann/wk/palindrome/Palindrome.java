package com.github.chandramohann.wk.palindrome;

/**
 * Palindrome class
 * 
 * Checks if the given string is a Palindrome or not Input parameter is a string
 * Return type is boolean based on the input string
 * 
 * 3 different implementations of the same methods with different O(n)
 * notations.
 *
 */

public class Palindrome {
	/*
	 * Performs n/2 comparison. 
	 * This method is used in current implementation of
	 * palindrome app
	 */
	public boolean isPalindrome(String str) {
		int n = str.length();
		for (int i = 0; i < n / 2; ++i) {
			if (str.charAt(i) != str.charAt(n - i - 1))
				return false;
		}
		return true;
	}

	// naive method
	public boolean isPalindromeNaive(String str) {
		int n = str.length();
		for (int i = 0; i < n; ++i) {
			if (str.charAt(i) != str.charAt(n - i - 1))
				return false;
		}
		return true;
	}

	// 2n notation
	public boolean isPalindrome2n(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}
}
