package com.github.chandramohann.wk.palindrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Palindrome app
 *
 */
public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(String[] args) throws IOException {
		Level level = Level.FINE;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter any string to check for palindrome:");
		do {
			String testString = br.readLine();
			/*
			 * pre-process String processedString = testString.replaceAll("\\s+",
			 * "").toLowerCase();
			 */
			if (testString.length() == 0) {
				System.out.print("Entered valid input string :");
				LOGGER.log(level, "Entered valid String");
				continue;
			} else {
				LOGGER.log(level, "Entered String is {0}", testString);
				Palindrome palindrome = new Palindrome();
				System.out.println(palindrome.isPalindrome(testString));
				/* 
				 * Sample Thread implementation
				 * testString acts as closure to the palindrome method
				 * 
				 * */
				// new Thread(() -> System.out.print("Result :"+
				// palindrome.isPalindrome(testString))).start();

			}
			if ("X".equalsIgnoreCase(testString)) {
				System.out.println("Exit interrupt encounterd :: gracefully exiting");
				LOGGER.log(level, "gracefully closing");
				br.close();
				System.exit(0);
			}
			System.out.print("Enter another string to check or x to exit: ");
		} while (true);

	}
}
