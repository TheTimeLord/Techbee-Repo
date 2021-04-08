package StringManipulation;
import java.lang.StringBuilder;

public class Palindrome {
	public static boolean isPalindrome(String str) {
		boolean palindrome = false;
		String reverse = new StringBuilder(str).reverse().toString();
		if(str.equals(reverse))
			palindrome = true;
		return palindrome;
	}
}
