package org.string;

public class PalidromString {
	public static void main(String[] args) {
		Integer number = 24542;
		if (isPalidrome(number)) {
			System.out.println("It's Palidrome ");
		} else {
			System.out.println("It's Not Palidrome ");
		}

		System.out.println("Is String is palidrome or not " + (isStringPalidrome("abaa") ? "** Yes" : "??No"));
		isPalindrome("aba");
	}

	public static boolean isStringPalidrome(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return (s.equals(rev));
	}

	public static boolean isPalidrome(Integer number) {
		Integer temp = number;
		// 453
		int sum = 0;
		while (number > 0) {
			int reminder = number % 10; // 3, 5 // 4
			sum = sum * 10 + reminder; // 30 +5 // 35 //350 +4 = 354
			number = number / 10; // 45 //4 // 0
		}
		if (temp == sum)
			return true;

		return false;
	}

	static boolean isPalindrome(String str) {

		// Pointers pointing to the beginning
		// and the end of the string
		int i = 0, j = str.length() - 1;

		// While there are characters to compare
		while (i < j) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				return false;

			// Increment first pointer and
			// decrement the other
			i++;
			j--;
		}

		// Given string is a palindrome
		return true;
	}
}
