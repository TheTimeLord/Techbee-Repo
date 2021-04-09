package StringManipulation;

public class Testing {
	public static void main(String[] args) {
		
		String str = "HellO There";
		String pal = "Racecar";
		String sent = "I heard silly funny things";
		
		System.out.println(str);
		System.out.println(Vowels.countVowels(str));
		System.out.println(Palindrome.isPalindrome(str));
		System.out.println(Words.countWords(str));
		System.out.println(Consonants.replaceConsonants(str));
		
		System.out.println();
		
		System.out.println(pal);
		System.out.println(Vowels.countVowels(pal));
		System.out.println(Palindrome.isPalindrome(pal));
		System.out.println(Words.countWords(pal));
		System.out.println(Consonants.replaceConsonants(pal));
		
		System.out.println();
		
		System.out.println(sent);
		System.out.println(Vowels.countVowels(sent));
		System.out.println(Palindrome.isPalindrome(sent));
		System.out.println(Words.countWords(sent));
		System.out.println(Consonants.replaceConsonants(sent));
		LastLetterCount.lastLetter(sent);
		
	}
}
