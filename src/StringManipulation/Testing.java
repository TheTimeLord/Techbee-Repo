package StringManipulation;

public class Testing {
	public static void main(String[] args) {
		
		String str = "Hello There";
		String pal = "racecar";
		
		System.out.println(str);
		System.out.println(Vowels.countVowels(str));
		System.out.println(Palindrome.isPalindrome(str) + "\n");
		
		System.out.println(pal);
		System.out.println(Vowels.countVowels(pal));
		System.out.println(Palindrome.isPalindrome(pal));
	}
}
