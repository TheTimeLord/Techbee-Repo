package StringManipulation;
import java.lang.StringBuilder;

public class Palindrome {
	public static boolean isPalindrome(String str) {
		boolean palindrome = false;
		str = str.toLowerCase();
		String reverse = new StringBuilder(str).reverse().toString();
		if(str.equals(reverse))
			palindrome = true;
		return palindrome;
	}
}
