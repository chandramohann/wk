package com.github.chandramohann.wk.palindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple Palindrome.
 */
public class PalindromeTest {

	private static Palindrome palindrome;

	@BeforeClass
	public static void testSetup() {
		palindrome = new Palindrome();
	}

	@AfterClass
	public static void testCleanup() {
		palindrome = null;
	}

	@Test
	public void testPalindromeForEvenCharacter() {
		assertTrue(palindrome.isPalindrome("redder"));
	}

	@Test
	public void testPalindromeForOddCharacter() {
		assertTrue(palindrome.isPalindrome("madam"));
	}

	@Test
	public void testForNotAPalindrome() {
		assertFalse(palindrome.isPalindrome("abracadabra"));
	}

	@Test
	public void testPalindromeWithSpace() {
		assertFalse(palindrome.isPalindrome("ma dam"));
	}

	@Test
	public void testPalindromeForCaseSensitive() {
		assertFalse(palindrome.isPalindrome("Madam"));
	}

	@Test
	public void testPalindromeWithSpecials() {
		assertFalse(palindrome.isPalindrome("M@dam"));
	}

	@Test
	public void testPalindromeForOddNumber() {
		assertTrue(palindrome.isPalindrome("12321"));
	}

	@Test
	public void tesPalindromeForEvenNumber() {
		assertTrue(palindrome.isPalindrome("123321"));
	}

	@Test(expected = NullPointerException.class)
	public void testPalindromeForNull() {
		assertTrue(palindrome.isPalindrome(null));
	}
}
